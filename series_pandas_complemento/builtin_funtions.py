
import pandas as pd

nba_players_name = pd.read_csv('/Users/YERELY/Desktop/UTVT/octavo/APLICACIONES WEB/DataFiles/nba_players_a.csv', sep=',', usecols=['Name']).squeeze()
nba_players_age = pd.read_csv('/Users/YERELY/Desktop/UTVT/octavo/APLICACIONES WEB/DataFiles/nba_players_a.csv', sep=',', usecols=['AGE']).squeeze()

print(f'Nombre de los jugadores:\n{nba_players_name}')
print(f'\nEdad de los jugadores:\n{nba_players_age}')

print(f'Función LEN:\n{len(nba_players_name)}')
print(f'Función TYPE:\n{type(nba_players_name)}')
print(f'Función SORTED:\n{sorted(nba_players_age)}')
print(f'Función MAX:\n{max(nba_players_age)}')
print(f'Función MIN:\n{min(nba_players_age)}')



