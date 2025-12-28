# shipping-containers
Java OOP application for calculating optimal shipping methods and costs for transporting products from China to Germany using container volume and weight constraints.
Project Overview

This repository contains a Java-based backend application developed for the Backend Programming course (Summer Semester 2024) at EU University Europe. The goal of the project is to design and implement an object-oriented solution that calculates the most cost-efficient shipping method for transporting products from China to Germany using container-based logistics.


Backend Programming HomeWork_ S…

Problem Description

The application simulates a shipping company that regularly transports different types of products, each with fixed dimensions and weight. Based on a user-defined order (e.g. quantities of laptops, mice, desktops, and LCD screens), the program calculates the total shipment volume and weight and determines the optimal combination of available containers. The solution must fit the shipment exactly into the containers while minimizing the total shipping cost, taking into account fixed and conditional pricing rules for small and big containers.


Backend Programming HomeWork_ S…

Solution Approach

The system is implemented using strict object-oriented programming principles. Products and containers are modeled as separate classes with encapsulated attributes and dedicated methods for volume calculation and data output. All calculations and business logic are handled through a dedicated calculation component that manages orders, aggregates shipment data, evaluates container combinations, and determines the best shipping option based on cost efficiency. The program reads order input from the user and outputs a clear summary of the selected shipping method and total price.

Key Features

The project demonstrates a clean package structure separating items, containers, and calculation logic. It uses inheritance and abstraction where appropriate, enforces private access for all variables, and relies on arrays or lists to store product and order information. Static methods are avoided in the business logic in compliance with the assignment requirements. The application provides readable console output for both item details and final shipping results.

Technologies and Concepts

The project is written in Java and follows object-oriented design principles including encapsulation, inheritance, and abstraction. It focuses on backend logic, algorithmic decision-making, and real-world problem modeling related to logistics and cost optimization. UTF-8 encoding is used throughout the project.
