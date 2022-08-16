import re

# Get things like
# Muse ft. Chvrches
# Muse feat. Chvrches
# Muse × Chrvches (note it's not the letter x, it's U+00D7 × MULTIPLICATION SIGN

# note that for authors, we only store the list, but for artists, we still need to store the original string.
# the
from orchard.parse.utils import try_dig
from orchard.vitals.arguments_decorator import with_arguments

ARTIST_REGEX = r"\s*?(?:ft\.|feat\.|×|,)\s*?"

@with_arguments("obj", "toml")
def artist_list_facet(obj, toml):
    if toml is not None and try_dig(["artists", "tokens"], toml):
        return try_dig(["artists", "tokens"], toml)
    artist_raw = obj["settings"]["artist"]
    artists = [
        s.strip() for s in re.split(ARTIST_REGEX, artist_raw) if s
    ]  # may have empty strings
    return artists