package com.hp.strixlib.single

import java.util.Locale


/**
 * Converts a string to Name Format (title case).
 *
 * @return The string converted to Name Format (title case).
 */
fun String.xToName() : String {
    return split(" ").joinToString(" ") { it ->
        it.replaceFirstChar {
        if (it.isLowerCase()) it.titlecase(
            Locale.ROOT
        ) else it.toString()
    } }
}