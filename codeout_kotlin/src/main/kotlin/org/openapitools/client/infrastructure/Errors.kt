@file:Suppress("unused")
package org.openapitools.client.infrastructure

import java.lang.RuntimeException

open class ClientException : RuntimeException {

    var statusCode: Int = -1

    /**
     * Constructs an [ClientException] with no detail message.
     */
    constructor() : super()

    /**
     * Constructs an [ClientException] with the specified detail message.

     * @param   message   the detail message.
     */
    constructor(statusCode: Int, message: kotlin.String) : super(message)
    {
        this.statusCode = statusCode
    }

    companion object {
        private const val serialVersionUID: Long = 123L
    }
}

open class ServerException : RuntimeException {

    var statusCode: Int = -1

    /**
     * Constructs an [ServerException] with no detail message.
     */
    constructor() : super()

    /**
     * Constructs an [ServerException] with the specified detail message.

     * @param   message   the detail message.
     */
    constructor(statusCode: Int, message: kotlin.String) : super(message)
    {
        this.statusCode = statusCode
    }

    companion object {
        private const val serialVersionUID: Long = 456L
    }
}