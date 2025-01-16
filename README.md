# Parking-Lot
Problem Statement

You are tasked with designing a Parking Lot System. The goal is to create a scalable and extensible design for a parking lot management system that supports various types of vehicles, pricing, and parking lot configurations.
Requirements
Core Functional Requirements

    Vehicle Types: The parking lot should support multiple vehicle types:
        Bike
        Car
        Truck
    Parking Spot Types:
        Small (for bikes)
        Medium (for cars)
        Large (for trucks or cars)
    Parking Operations:
        Allow vehicles to enter the parking lot if a suitable spot is available.
        Allocate the closest suitable parking spot.
        Free up a parking spot when a vehicle leaves.
    Payment System:
        The parking fee should depend on the type of vehicle and the duration of parking.
        Assume the parking lot charges hourly rates:
            Bike: ₹10/hour
            Car: ₹20/hour
            Truck: ₹30/hour

Non-Functional Requirements

    The design should be extensible to allow:
        Adding new parking spot types in the future.
        Introducing new vehicle types or pricing logic.
    Ensure the system is efficient, avoiding unnecessary iteration or delays when allocating/freeing spots.
    Handle concurrent parking operations gracefully.

Constraints

    Assume the parking lot has N parking spots of varying sizes distributed across multiple floors.
    The system must handle up to 500 vehicles entering or exiting per hour.
    Assume vehicles are assigned a unique registration number.
