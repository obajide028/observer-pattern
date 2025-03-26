# Observer Pattern
 
The **Observer Pattern** defines a one to many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.

This pattern is commonly used for implementing distributed event-handling systems, such as UI listeners, messaging services, and real-time data updates.

---

### **Concept Overview**
The **Observer Pattern** works like a subscription system. One object(The Subject) maintains a list of dependents(the Observers) and notifies them of state changes.

### **Key Concepts**
- **Subject**: The main object that maintains the observers and notifies them of changes.
- **Observer**: Objects that subscribe to the subject to get notified of changes.
- **Loose Coupling**: The subject and observers interacts through an interface, making them independent of each other.

### **Advantages**
- ✅ **Decouples subjects from observers** – Subjects do not need to know concrete observer implementations.
- ✅ **Promotes reusability** - New observers can be added without modifying the subjects.
- ✅ **Adherence to SOLID Principles**:
   - **Open/Closed Principle** – New observers can be introduced without modifying the subject.
   - **Single Responsibility Principle** – Each class has a well-defined role.

---

## **Observer Pattern in Action: Weather Monitoring System**

### **How It Works**
Instead of hardcoding weather updates inside multiple display units, we delegate them to an observer system.

### **1️⃣ Define the Observer Interfaces**
 We create an Observer interface that defines the `update()` method, which will be called when the subject's state change.

### **2️⃣ Define the Subject Interface**
The Subject interface allows observers to subscribe, unsubscribe, and get notified of updates.

### **3️⃣ Implement the Concrete Subject**
The `WeatherStation`(Subject) stores the weather data and notifies all the registered observers whenever data changes.

### **4️⃣ Implement Concrete Observers**
Different display elements (examples: `TvDisplay`, `PhoneDisplay`) these observers subscribes to the weather station and get updates, then the data received is displayed when notified.

---

## **Conclusion**
The **Observer Pattern** promotes flexibility, reusability and maintainability by allowing components to communicate without being tightly coupled. It ensures real-time updates and also follows SOLID Principles, making it a powerful design choice for event driven applications.

By applying this pattern to the Weather Station simulation, I built a system where multiple components stay in sync, resulting in cleaner and more scalable code.🚀
