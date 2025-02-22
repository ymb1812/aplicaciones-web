import pandas as pd

kid_gifts = {
    'videogames' :'Pay 5',
    'boardgames' :'Monopoly',
}

serie = pd.Series(kid_gifts)

print(f'\n{serie}')