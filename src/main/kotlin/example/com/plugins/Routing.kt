package example.com.plugins

import example.com.routes.addDriver
import example.com.routes.getDriver
import example.com.routes.removeDriver
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        getDriver()
        addDriver()
        removeDriver()
        // Static plugin. Try to access `/static/index.html`
        static() {
            resources("static")
        }
    }
}
