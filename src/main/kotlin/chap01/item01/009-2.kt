package chap01.item01

interface Element {
    var active: Boolean
}

class ActualElement: Element {
    override var active: Boolean = false
}