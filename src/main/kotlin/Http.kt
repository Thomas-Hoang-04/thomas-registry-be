package com.thomas

import io.ktor.server.application.*
import io.ktor.server.plugins.forwardedheaders.*
import io.ktor.server.response.*

fun Application.configureHttp() {
    install(ForwardedHeaders) // WARNING: for security, do not include this if not behind a reverse proxy
    install(XForwardedHeaders)
}
