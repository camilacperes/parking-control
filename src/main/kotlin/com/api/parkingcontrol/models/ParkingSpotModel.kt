package com.api.parkingcontrol.models

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "TB_PARKING_SPOT")
class ParkingSpotModel : java.io.Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: UUID? = null

    @Column(nullable = false, unique = true, length = 10)
    var parkingSpotNumber: String = ""
    //numero da vaga, nao pode ser nulo, vai ser campo unico, com um tamanho de no max 10

    @Column(nullable = false, unique = true, length = 7)
    var licensePlateCar: String? = null

    @Column(nullable = false, length = 70)
    var brandCar: String? = null

    @Column(nullable = false, length = 70)
    var modelCar: String? = null

    @Column(nullable = false, length = 70)
    var colorCar: String? = null

    @Column(nullable = false)
    var registrationDate: java.time.LocalDateTime? = null
    //o dia em que vai ser feito o registro da vaga

    @Column(nullable = false, length = 130)
    var responsibleName: String? = null

    @Column(nullable = false, length = 30)
    var apartment: String? = null

    @Column(nullable = false, length = 30)
    var block: String? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}


