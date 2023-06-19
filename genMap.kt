import kotlin.random.Random
class forCor(maX:Int,maY:Int){
    var maxX=maX
    var maxY=maY
    var a=MutableList(maX){MutableList(maY){"."} }
    var startX=Random.nextInt(0, maxX)
    var startY=Random.nextInt(0, maxY)
}
fun updateArray(a: forCor): forCor {
    var s = Random.nextInt(1, 5)
    when (s) {
        1 -> if (a.startX != 0) a.startX -= 1 else a.startX += 1
        2 -> if (a.startX != a.maxX - 1) a.startX += 1 else a.startX -= 1
        3 -> if (a.startY != 0) a.startY -= 1 else a.startY += 1
        4 -> if (a.startY != a.maxY - 1) a.startY += 1 else a.startY -= 1
    }
    a.a[a.startX][a.startY] = "*"
    return a
}
fun createMap(maxX:Int,maxY:Int,forInt:Int):MutableList<MutableList<String>>{
    var a=forCor(maxX,maxY)
    for (i in 0..forInt){
        a=updateArray(a)
    }
    return a.a
}
fun main(){
    for (i in 0..15) {
        var a=createMap(12,12,50)
        for (i in a) {
            println(i)
        }
        println("--------------")
    }
}
