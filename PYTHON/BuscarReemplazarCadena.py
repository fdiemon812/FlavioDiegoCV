'''
Diseñar una función que reciba como parámetro tres cadenas, 
la primera será una frase y deberá buscar si existe la palabra que recibe 
como segundo parámetro y reemplazarla por la tercera
'''
def buscaryReemplazar(texto, palabra, reemplazo):
    texto=texto + " "
    lista=[]
    palabra= " "+palabra
    reemplazo=" "+reemplazo
    mensaje=""
    for i in texto:
        if i==(" "):    
            if mensaje != palabra:
                lista.append(mensaje)
            else: 
                lista.append(reemplazo)
            mensaje=""
        mensaje=mensaje+i
    texto=""
    for i in lista:
        texto=texto+i
    return texto
print(buscaryReemplazar("La lluvia en sevilla es una maravilla, porque cuando llueve en sevilla no hace tanto calor", " ", "  "))