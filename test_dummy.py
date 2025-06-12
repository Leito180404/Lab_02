import pathlib

def test_dataset_exists():
    assert (pathlib.Path('Ciudad/ciudad.txt')).exists()
