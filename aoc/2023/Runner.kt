package aoc.`2023`

import java.io.File
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.net.http.HttpResponse.BodyHandlers


fun main(args: Array<String>) {
    val day = Day1()
    day.solve()
    println(pullDaysInput(day.getDay()))
}

fun pullDaysInput(day: Int): String? {
    val dayInputFile = File("")
    val request = HttpRequest.newBuilder()
            .uri(URI("https://adventofcode.com/2023/day/$day/input"))
            .GET()
            .header("Cookie", "_ga=GA1.2.486382800.1703024798; _ga_MHSNPJKWC7=GS1.2.1703433573.5.0.1703433573.0.0.0; session=53616c7465645f5f6fa93e5c839d3d1c871c1e4fb8def360a8649ed55d5774ce36254dbc0b13d0d0b4867b7d4b2210cd7681ef9a22249444be90c098743ec8b8; _gid=GA1.2.603486881.1703433573; _gat=1")
            .build()
    val client = HttpClient.newHttpClient()
    val response = client.send(request, BodyHandlers.ofString())
    return response.body()
}