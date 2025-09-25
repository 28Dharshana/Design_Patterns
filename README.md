Observer Pattern – Weather Notification System
Description

The Observer Pattern is a behavioral design pattern that defines a one-to-many dependency between objects. When one object (the subject) changes state, all its dependents (the observers) are automatically notified and updated.

In this example, we implemented a Weather Notification System:

WeatherStation is the subject that maintains the current weather info.

Subscriber is the observer interface implemented by concrete subscribers:

PhoneSubscriber – receives notifications on a phone.

EmailSubscriber – receives notifications via email.

Users can subscribe/unsubscribe to weather updates dynamically.

The system demonstrates real-time notifications without hardcoding updates.

Key Features Implemented:

Logging through System.out and System.err.

Validations (e.g., null subscriber check).

Exception handling during notifications.

Dynamic subscribe/unsubscribe functionality.

How to Run the Code
1. Compile Java Files

Place all .java files in the same folder (Exercise1) and open Command Prompt there:

javac *.java

2. Run the Program
java Main



FINAL OUTPUT
<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/b469b20d-b2bc-4897-8b89-5f1a2b2c44a5" />

