'''
Created on 20 dic. 2020

@author: flavio
'''
from random import randint


def crearNumSecreto():      #Creamos un numero de 5 cifras entre 00000 y 99999
    numSecreto= randint(1,99999)
    if numSecreto <10000 and numSecreto>999:
        numSecreto="0"+str(numSecreto)
    elif numSecreto <1000 and numSecreto>99:
        numSecreto="00"+str(numSecreto)
    elif numSecreto <100 and numSecreto>9:
        numSecreto="000"+str(numSecreto)
    elif numSecreto <10 and numSecreto>0:       #Le añadimos estas estructura para que siempre tenga 5 cifras y este en el formato"00001"
        numSecreto="0000"+str(numSecreto)
    else:
        str(numSecreto)

    return str(numSecreto)


def compruebaNumero(numero,miNumero):      #Comprueba la apuesta con el numero secreto y devuevle la pista para seguir
    respuesta=["-","-","-","-","-"]
    for k in range(0,len(numero)):
        for i in range(0,len(miNumero)):
            
            if numero[k]==miNumero[i] and k==i:
                respuesta[i]="X"
            
            
            elif numero[k]==miNumero[i] and respuesta[i]!="X":   #PAra que la X no sea pisada por la Y
                respuesta[i]="Y"
            
                    
    return("%s%s%s%s%s"%(respuesta[0],respuesta[1],respuesta[2],respuesta[3],respuesta[4]))

def mostrarMenu():  #Nos muestra el menu principal 
    print("""
    
    MASTERMIND!!!!
    
    X=Posición y numero correcto
    Y=numero correcto
    Recuerda que pueden repetirse números
    
    Para empezar, escoge una dificultad:
    
    1. Aprendiz
    2. Persona
    3. Maestro
    4. Gurü
    
    
    
    """)
    dificultad=str(input())
    while dificultad!="1" and dificultad!="2" and dificultad!="3" and dificultad!="4":
        dificultad=str(input("Error, introduce una dificultad valida"))
        
    if dificultad=="1":
        numIntentos=10           #Estructura para seleccionar que nivel de dificultad queremos
        
    elif dificultad=="2":
        numIntentos=7
        
    elif dificultad=="3":
        numIntentos=5
    else:
        numIntentos=3
        
    return numIntentos         #DEvuelve el numero de intentos posibles para el jugador


def main():
    
    numeroSecreto=crearNumSecreto()
    intentosPosibles=mostrarMenu()
    intentos=0
    resultado=""
   
    
    
    while resultado!="XXXXX" and intentos<intentosPosibles:
        
        apuesta=str(input("Introduce tu numero de 5 digitos"))
        
        while  len(apuesta)!=5:
            apuesta=str(input("Error!! Introduce tu numero de 5 digitos"))
        while (apuesta[0]!= "0" and apuesta[0]!= "1" and apuesta[0]!= "2" and apuesta[0]!= "3" and apuesta[0]!= "4" and apuesta[0]!= "5" and apuesta[0]!= "6" and apuesta[0]!= "7" and apuesta[0]!= "8" and apuesta[0]!= "9")  or (apuesta[1]!= "0" and apuesta[1]!= "1" and apuesta[1]!= "2" and apuesta[1]!= "3" and apuesta[1]!= "4" and apuesta[1]!= "5" and apuesta[1]!= "6" and apuesta[1]!= "7" and apuesta[1]!= "8" and apuesta[1]!= "9") or (apuesta[2]!= "0" and apuesta[2]!= "1" and apuesta[2]!= "2" and apuesta[2]!= "3" and apuesta[2]!= "4" and apuesta[2]!= "5" and apuesta[2]!= "6" and apuesta[2]!= "7" and apuesta[2]!= "8" and apuesta[2]!= "9") or ( apuesta[3]!= "0" and apuesta[3]!= "1" and apuesta[3]!= "2" and apuesta[3]!= "3" and apuesta[3]!= "4" and apuesta[3]!= "5" and apuesta[3]!= "6" and apuesta[3]!= "7" and apuesta[3]!= "8" and apuesta[3]!= "9" ) or ( apuesta[4]!= "0" and apuesta[4]!= "1" and apuesta[4]!= "2" and apuesta[4]!= "3" and apuesta[4]!= "4" and apuesta[4]!= "5" and apuesta[4]!= "6" and apuesta[4]!= "7" and apuesta[4]!= "8" and apuesta[4]!= "9"):
            apuesta=str(input("Error, Introduce tu numero de 5 digitos en el formato ----- "))
        resultado=compruebaNumero(numeroSecreto, apuesta)
        print("%s -> Quedan %s intentos"% (resultado, intentosPosibles-intentos-1))
        intentos+=1
    
    if intentosPosibles-intentos==0:
        print("""
        GAME OVER
        El numero secreto era %s
        """%numeroSecreto)
    else:
        print("Enhorabuena, el numero secreto era %s, Lo has resuelto en %s intentos"%(numeroSecreto,intentos))

main()






