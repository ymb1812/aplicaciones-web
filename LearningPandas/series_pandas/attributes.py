import pandas as pd

good_student_qualities = ['Self-Discipline', 'Self-Discipline', 'Goal-Oriented', 'Puntuality', 'Diligence and Hard Work', 'Respectful', 'Passionate', 'Responsible']
serie = pd.Series(good_student_qualities)
print(serie)

# El tamaño de la serie
print(f'El tamaño de la serie es el siguiente: {serie.size}')

# La serie tiene valores duplicados
print(f'La serie tiene valores duplicados: {serie.is_unique}')

# Informacion de los indices
print(f'Este atributo muestra informacion de los indices: {serie.index}')

# Informacion del almacenamiento de los valores de la serie
print(f'Informacion de los valores de la serie: {serie.values}')

# Informacion del tipo de datos que se utilizan para almacenar los valores de la serie
print(f'Tipo de datos: {type(serie.values)}')
