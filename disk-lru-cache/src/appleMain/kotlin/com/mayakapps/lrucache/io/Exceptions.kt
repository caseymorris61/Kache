package com.mayakapps.lrucache.io

internal actual open class IOException actual constructor(message: String?, cause: Throwable?) :
    Exception(message, cause)

internal actual open class FileNotFoundException actual constructor(message: String?) : IOException(message)