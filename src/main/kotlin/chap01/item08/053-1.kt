package chap01.item08

import java.util.Random

fun main() {
    println("What is your name?")
    val name = readLine()
    if (!name.isNullOrBlank()) {
        println("Hello ${name.toUpperCase()}")
    }

    val news: List<News>? = getNews()
    if (!news.isNullOrEmpty()) {
        news.forEach { notifyUser(it) }
    }
}

class News

fun getNews(): List<News>? {
    val random = Random()
    val result = random.nextInt()
    val news = News()
    if (result >= 0 ) {
        return listOf(news)
    } else {
        return null
    }


}

fun notifyUser(news: News) {
    println("notified : $news")
}