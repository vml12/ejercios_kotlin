// ejercicio1
fun main() {
println("Ingrese su nombre:")
var nombre = readLine()!!
println("Ingrese su materia:")
var materia = readLine()!!
println("Ingrese la nota 1:")
var nota1 = readLine()!!.toFloat()
println("Ingrese la nota 2:")
var nota2 = readLine()!!.toFloat()
println("Ingrese la nota 3:")
var nota3 = readLine()!!.toFloat()
var prom = (nota1 + nota2 + nota3) / 3
println("El promedio de notas es: $prom")
if (prom < 3.5) {
println("El estudiante $nombre perdió la materia $materia")
}


//ejercicio 2
fun main() {
var scanner = Scanner(System.`in`)
println("Ingrese el valor de la compra: ")
var valorCompra = scanner.nextFloat()
println("Valor Compra: $valorCompra")
var descuento = 0.0
if (valorCompra >= 100000) {
descuento = valorCompra * 0.5
valorCompra -= descuento
println("Se aplicó un descuento del 50% equivalente a: $descuento")
} else {
descuento = valorCompra * 0.1
valorCompra -= descuento
println("Se aplicó un descuento del 10% equivalente a: $descuento")
}
println("Valor Final: $valorCompra")
}

//ejercicio3
fun main(){
  val nombre = readLine()!!
val materia = readLine()!!
val nota1 = readLine()!!.toFloat()
val nota2 = readLine()!!.toFloat()
val nota3 = readLine()!!.toFloat()
val prom = (nota1 + nota2 + nota3) / 3
println("El promedio de notas es: $prom")
if (prom >= 3.5) {
println("El estudiante $nombre GANÓ la materia $materia")
} else {
println("El estudiante $nombre PERDIÓ la materia $materia")
if (prom >= 2.5) {
println("$nombre Puede recuperar")  
}
}
}

//ejercicio4
fun main(){
var resp = "si"
var cont = 0
while (resp == "si") {
print("\nIngrese su nombre: ")
var nombre = readLine()!!
println("Hola $nombre bienvenido a la clase!\n")
cont++
3. Estructuras de Control Kotlin 16
print("Ingrese si, si hay más personas: ")
resp = readLine()!!
}
println("Llegaron $cont Personas!")
}

//ejercicio5

fun main(){
print("Ingrese un número: ")
val n = readLine()!!.toInt()
var i = 1
while (i <= n){
if (i % 2 == 0) {
println(i)
}
i++
}
}

//ejercicio6

fun main(){
var dayNum=5
when (dayNum) {
1 -> println("Lunes")
2 -> println("Martes")
3 -> println("Miércoles")
4 -> println("Jueves")
5 -> println("Viernes")
6 -> println("Sábado")
7 -> println("Domingo")
else -> println("Día inválido")
}
}

//ejercicio7

fun main() {
print("Ingrese la cantidad de números a procesar: ")
val cantidad = readLine()!!.toInt()
for (i in 1..cantidad) {
print("Ingrese un número: ")
val numero = readLine()!!.toInt()
if (numero % 11 == 0) {
println("El número $numero es divisible entre 11")
} else {
println("El número $numero no es divisible entre 11")
}