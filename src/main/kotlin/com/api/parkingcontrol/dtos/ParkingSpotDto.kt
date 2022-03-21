package com.api.parkingcontrol.dtos

import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

class ParkingSpotDto {
    var parkingSpotNumber: @NotBlank String? = null
    var licensePlateCar: @NotBlank @Size(max = 7) String? = null
    var brandCar: @NotBlank String? = null
    var modelCar: @NotBlank String? = null
    var colorCar: @NotBlank String? = null
    var responsibleName: @NotBlank String? = null
    var apartment: @NotBlank String? = null
    var block: @NotBlank String? = null
}