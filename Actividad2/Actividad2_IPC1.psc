Algoritmo IPC1Actividad2_202308221
	Definir n,i Como Entero
	Leer n
	si n<=1 Entonces
		Escribir "No es primo"
	SiNo
		i<-1
		Para i desde 2 Hasta n^(1/2) Con Paso 1 Hacer
			si	(n%i)=0 Entonces
				Escribir n, " no es primo"
				i<-n+1
			SiNo
				Escribir "el numero es primo"
				i<-n+1
			FinSi
		FinPara
	FinSi
FinAlgoritmo
