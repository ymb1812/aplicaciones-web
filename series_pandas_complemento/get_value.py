import pandas as pd

nba_players = pd.read_csv('/Users/YERELY/Desktop/UTVT/octavo/APLICACIONES WEB/DataFiles/nba_players_a.csv', usecols=['Name']).squeeze()

single_value = nba_players.iloc[99]
print(single_value)

multi_values = nba_players.iloc[:100].tolist()
multi_values_2 = nba_players.iloc[:100]
print(multi_values)
print(len(multi_values))

print(type(multi_values))
print(type(multi_values_2))