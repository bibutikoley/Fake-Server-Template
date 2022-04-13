//<http://localhost:3000/devices?_page=1>; rel="first", <http://localhost:3000/devices?_page=1>; rel="prev", <http://localhost:3000/devices?_page=3>; rel="next", <http://localhost:3000/devices?_page=20>; rel="last"

val link =
    "<http://localhost:3000/devices?_page=1>; rel=\"first\", <http://localhost:3000/devices?_page=1>; rel=\"prev\", <http://localhost:3000/devices?_page=3>; rel=\"next\", <http://localhost:3000/devices?_page=20>; rel=\"last\""

val mapped = link.split(",").associate {
    val (url, rel) = it.split(";")
    val (_, pageNo) = url.split("=")
    val (_, relValue) = rel.split("=")
    Pair(
        relValue.trim().removeSurrounding("\""),
        pageNo.trim().removeSurrounding("\"").removeSuffix(">")
    )
}

print(mapped)

mapped.forEach {
    println("${it.key} : ${it.value}")
}


//This file is used to find the page nos from the header.
