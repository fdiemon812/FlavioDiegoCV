'''
Crear una función que, 
tomando una cadena de texto como entrada, 
construya y devuelva otra cadena formada de la siguiente manera: 
el método debe colocar todas las consonantes al principio y todas 
las vocales al final de la misma, eliminando los blancos.Por ejemplo, 
pasándole la cadena "curso de programacion", una posible solución sería "crsdprgrmcnuoeoaaio
'''


def ordenaLetras(texto):
    list1=[]
    list2=[]
    for i in texto:
        if i != "a" and i != "e" and i != "i" and i != "o" and i != "u" and i!= " ":
            list1.append(i) 
        elif (i == "a" or i == "e" or i == "i" or i == "o" or i == "u") and i!= " ":
            list2.append(i)     
    list1=list1+list2
    texto=""
    for i in list1:
        texto=texto+i
    return texto

print(ordenaLetras(" La lluvia en Sevilla es una maravilla "))

def ordenaLetras2(texto):
    list1=[]
    for i in texto:
        if i != "a" and i != "e" and i != "i" and i != "o" and i != "u" and i!= " ":
            list1.append(i) 
    for i in texto:    
        if (i == "a" or i == "e" or i == "i" or i == "o" or i == "u") and i!= " ":
            list1.append(i)     
    texto=""
    for i in list1:
        texto=texto+i
    return texto

print(ordenaLetras2(" La lluvia en Sevilla es una maravilla "))






