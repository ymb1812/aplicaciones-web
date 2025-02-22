result = None
numero_x = 10
numero_y = 2

try:

    numero_x = int(input("Ingresa un numero x: "))
    numero_y = int(input("Ingresa un numero y: "))
    result = numero_x / numero_y
    print(f'El resultado de la división es: {result}')
#except ZeroDivisionError as e:
    #print(f'La excepción es la siguiente: {e}')
#except ValueError as e:
    #print(f'La excepción de ValueError genero el siguiente mensaje: {e}')
except Exception as e:
    print(f'La excepción de Excepcion genero el siguiente mensaje: {e}')
finally:
    print(f'Nuestro programa ha finalizado')
