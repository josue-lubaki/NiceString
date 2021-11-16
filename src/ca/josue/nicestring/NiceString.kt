package ca.josue.nicestring

fun String.isNice(): Boolean {
    // verify least vowel
    val vowel = listOf('a','e','i','o','u')
    val isContainsLeastThreeVowels : Boolean = this.count { vowel.contains(it) } >= 3

    // verify contain substring
    val wrongWord = listOf("bu","ba","be")
    val isContainsWrongWord : Boolean = !wrongWord.any { this.contains(it) }

    // verify Double Letter
    var isContainsDoubleLetter = false
    this.forEachIndexed { index: Int, ch: Char ->
        if (index != 0){
            if (this[index - 1] == ch)
                isContainsDoubleLetter = true
        }

        return@forEachIndexed
    }

    // if at least two of the following conditions are satisfied
    return listOf(isContainsLeastThreeVowels, isContainsWrongWord, isContainsDoubleLetter).count { it } >= 2
}