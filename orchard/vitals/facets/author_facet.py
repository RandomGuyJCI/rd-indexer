import re
from orchard.vitals.arguments_decorator import with_arguments

# Get things like
# donte, ladybug
# donte & ladybug
# donte and ladybug
# donte, noche, and ladybug
# donte, noche, & ladybug

AUTHOR_REGEX = r"\s*?(?:,|&|\/|\\|,? ,?and )\s*?"


@with_arguments("obj")
def author_facet(obj):
    author_raw = obj["settings"]["author"]
    authors = [
        s.strip() for s in re.split(AUTHOR_REGEX, author_raw) if s
    ]  # may have empty strings
    return authors
