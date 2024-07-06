package example.com.routes

import example.com.data.DriverList
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.getDriver(){
    get("/drivers"){
        call.respond(
            HttpStatusCode.OK,
            DriverList
        )
    }

    get("/driver/{id}"){
        val id = call.parameters["id"]
        val driver = DriverList.find { it.id == id }
        if (driver!= null){
            call.respond(
                HttpStatusCode.OK,
                driver
            )
        }else{
            call.respond(
                HttpStatusCode.NotFound,
                "Driver with the id not found"
            )
        }
    }
}

fun Route.removeDriver(){
    delete("/driver/{id}"){
        val id = call.parameters["id"]
        val deletedDriver = DriverList.find { it.id == id }
        if ( deletedDriver != null){
            DriverList.remove(deletedDriver)
            call.respond(
                HttpStatusCode.Accepted,
                deletedDriver
            )
        }else{
            call.respond(
                HttpStatusCode.NotFound,
                "Driver with id not found"
            )
        }
    }
}