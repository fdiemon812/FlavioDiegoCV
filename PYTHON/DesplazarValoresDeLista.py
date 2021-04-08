'''
Realiza un programa que lea 10 números, 
debe imprimir los 10 número y después desplazarlos una posición,
 de tal forma que el último pase a la primera posición, el primero
  a la segunda, el segundo a la tercera, y así sucesivamente
'''


listaNum=[1,2,3,4,5,6,7,8,9,10]

def saltoHaciaIzquierda(lista):
    ultimo=lista[0]
    for i in range(len(lista)-1):
        
        lista[i]=lista[i+1]
    lista[-1]=ultimo
    return lista

def saltoHaciaDerecha2(lista):
    for i in range(len(lista)-1): #@UnusedVariable
        saltoHaciaIzquierda(lista)
    return lista


def saltoHaciaDerecha(lista):
    ultimaPos=lista[-1]
    for i in range(len(lista)-1,0,-1):
        lista[i]=lista[i-len(lista)-1]
    lista[0]=ultimaPos
    return lista


print(listaNum)
print(saltoHaciaDerecha(listaNum))

