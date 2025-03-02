import pandas as pd

nba_players = pd.read_csv('/Users/YERELY/Desktop/UTVT/octavo/APLICACIONES WEB/DataFiles/nba_players_a.csv', usecols=['DRtg']).squeeze()
some_values = nba_players.iloc[:5]

addition_1 = some_values + 10
addition_2 = some_values.add(10)

print('Realización de una suma')
print(some_values)
print(addition_1)
print(addition_2)

print('Realización de una resta')
subtract_1 = some_values - 10
subtract_2 = some_values.sub(10)

print(subtract_1)
print(subtract_2)

print('Realización de una multiplicación')
multiplication_1 = some_values * 10
multiplication_2 = some_values.mul(10)

print(multiplication_1)
print(multiplication_2)

print('Realización de una división')
division_1 = some_values / 10
division_2 = some_values.div(10)

print(division_1)
print(division_2)