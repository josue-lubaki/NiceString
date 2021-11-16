package ca.jtbrand.solution

fun String.isNice(): Boolean {
    // verify wrong word
    val noBadSubstring = setOf("ba", "be", "bu").none { this.contains(it) }

    // verify vowel
    val hasThreeVowels = count{ it in "aeiou" } >= 3

    // verify double letter
    val hasDouble = zipWithNext().any{ it.first == it.second }

    return listOf(noBadSubstring, hasThreeVowels, hasDouble).count{ it } >= 2
}