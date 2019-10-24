package com.artwork.online.eartwork.controller;

import com.artwork.online.eartwork.model.Artwork;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins={"http://localhost:4200","http://localhost","http://localhost:4201"},allowedHeaders = "*")
@RequestMapping(value = "/eartwork/api/checkout",produces = MediaType.APPLICATION_JSON_VALUE)
public class CheckOutController {

    @PostMapping(value="/proceed/{userId}")
    public boolean checkout(@PathVariable Integer userId, @RequestBody Artwork[] artwork){


        return false;
    }
}
