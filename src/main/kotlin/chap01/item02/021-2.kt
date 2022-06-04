package chap01.item02

import chap01.item01.User

//나쁜 예
//fun main() {
//    var user: User
//    for (i in users.indeices) {
//        user = users[i]
//        println("User at $i is $user")
//    }
//}

//조금 더 좋은 예
//fun main() {
//    for (i in users.indices) {
//        val user = users[i]
//        println("User at $i is $user")
//    }
//}

//제일 좋은 예
//fun main() {
//    for ((i, user) in users.withIndex()) {
//        println("User at $i is $user")
//    }
//}