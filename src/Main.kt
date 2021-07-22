fun main() {
    print(palindromeRearranging("aabb"))
}

fun palindromeRearranging(inputString: String): Boolean {
    var myList= inputString.toList()
    var uniqueChar= mutableListOf<Char>()
    for(item in myList)
        if(item !in uniqueChar)
            uniqueChar.add(item)
    var count=0
    var newList=mutableListOf<Char>()
    for(item in uniqueChar){
        count=0
        for(i in 0 until myList.size)
            if(myList[i]==item)
                count++
        if(count%2!=0)
            continue
        if(newList==null)
            for(i in 0 until count)
                newList.add(item)
        else{
            var j=0
            while(j<count){
                var k=newList.size/2
                newList.add(k,item)
                k++
                j++
            }               }
    }
    for(item in uniqueChar){
        count=0
        for(i in 0 until myList.size)
            if(myList[i]==item)
                count++
        if(count%2!=0){
            var j=0
            while(j<count){
                var k=newList.size/2
                newList.add(k,item)
                k++
                j++} }
    }
    var myString=""
    for(item in newList)
        myString=myString.plus(item.toString())

    if(myString==myString.reversed())
        return true
    else
        return false
}
