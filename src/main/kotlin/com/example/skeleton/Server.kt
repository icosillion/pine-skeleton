package com.example.skeleton

import com.icosillion.pine.Pine
import com.icosillion.pine.annotations.Route
import com.icosillion.pine.http.Request
import com.icosillion.pine.http.Response
import com.icosillion.pine.responses.modifiers.withText

class RootResource() {

    @Route("/")
    fun index(request: Request, response: Response): Response {
        return response.withText("Hello World!")
    }
}

fun main(args: Array<String>) {

    val pine = Pine()

    pine.resource(RootResource())

    pine.start()
}