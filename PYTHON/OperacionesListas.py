'''
    1. Crea un programa que genere 1OO números de forma aleatoria y que posteriormente ofrezca al usuario la posibilidad de:
        1. Conocer el mayor de los números
        2. Conocer el menor de los números
        3. Obtener la suma de todos los números
        4. Obtener la media d ellos números
        5. Sustituir el valor de un elemento por otro número introducido por teclado.
        6. Mostrar todos los números.
    Realiza las opciones con funciones.
'''
from random import randint

#DEFINIMOS CADA OPERACION

def mayorNum(lista):
    mayor=0
    for i in range(len(lista)):
        if mayor<lista[i]:
            mayor=lista[i]
    return mayor

def menorNum(lista):
    menor=10000
    for i in range(len(lista)):
        
        if menor>lista[i]:
            menor=lista[i]
    return menor

def sumaNum(lista):
    suma=0
    for i in range(len(lista)):
        suma=suma+lista[i]
    return suma

def mediaNum(lista):
    if len(lista)>1:
        return (sumaNum(lista)/int(len(lista)))
    

def sustituirElemento(lista):
    antiguoElemento=int(input("Introduce el numero a sustituir"))
    while antiguoElemento not in lista:
        antiguoElemento=int(input("Error, no existe ese elemento. Introduce de nuevo:"))
    nuevoElemento=int(input("Introduce el numero nuevo"))
    for i in range(0,len(lista)):
        if lista[i]==antiguoElemento:
            lista[i]=nuevoElemento
    return lista

def mostrarLista(lista):
    return lista



#AQUI EMPIEZA EL MAIN

listaNumeros=[]
for i in range(0,5):
    aleatorio=randint(0,10000)
    if aleatorio not in listaNumeros:
        listaNumeros.append(aleatorio)
        

opcionElegida=1
while opcionElegida!=0:        
    opcionElegida=int(input("""
        BIENVENIDO!!    Selecciona la opción que quieras:
        1. Conocer el mayor de los números
        2. Conocer el menor de los números
        3. Obtener la suma de todos los números
        4. Obtener la media d ellos números
        5. Sustituir el valor de un elemento por otro número introducido por teclado.
        6. Mostrar todos los números.
        0. FIN
        
        """ ))        
    
    while opcionElegida!= 1 and opcionElegida!= 2 and opcionElegida!= 3 and opcionElegida!= 4 and opcionElegida!= 5 and opcionElegida!= 6 and opcionElegida!=0:
        opcionElegida=int(input("Vuelve a introducir la opción"))
    
            
    if opcionElegida==1:
        print(mayorNum(listaNumeros))
    elif opcionElegida==2:
        print(menorNum(listaNumeros))
    elif opcionElegida==3:
        print(sumaNum(listaNumeros))
    elif opcionElegida==4:
        print(mediaNum(listaNumeros))
    elif opcionElegida==5:
        print(sustituirElemento(listaNumeros))
    elif opcionElegida==6:
        print(mostrarLista(listaNumeros))
    else:
        opcionElegida=0
        print("Hasta luego!!")
        
        
        
        