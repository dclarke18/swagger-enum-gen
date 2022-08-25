package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import static io.micronaut.http.MediaType.APPLICATION_JSON;

@Controller
public class HelloHttpController {

    @Operation(summary = "Says hi")
    @ApiResponses({
            @ApiResponse(responseCode = "200",
                    description = "The greeting",
                    content = @Content(schema = @Schema(implementation = ResponseEnum.class))
            )
    })
    @Get(uri = "/hello", produces = APPLICATION_JSON)
    public ResponseEnum hello() {
        return ResponseEnum.GREETINGS;
    }

}
