# ⚡ Electricity Bill Management System  
### By Utkarsh Shukla

A full-stack **Java + MySQL desktop application** for managing electricity billing using **Swing (GUI)** and **JDBC**.

---

## 🚀 Tech Stack

- 💻 **Core Java (JDK 18)**
- 🖼️ **Java Swing** – User interface
- 🗄️ **MySQL** – Database
- 🔗 **JDBC** – Database connectivity
- 📦 **rs2xml.jar** – ResultSet to JTable integration

---

## 🎯 Features

- ✅ Customer Registration & Profile Management  
- ✅ Meter Data Input & Bill Calculation  
- ✅ Bill History Tracking  
- ✅ Print-Friendly Bill Summary  
- ✅ Admin Panel for Bill Monitoring  
- ✅ Responsive Java Swing UI  
- ✅ Real-time MySQL connectivity  

---

## 📸 UI Screenshots
['sample'](image.png,'Utkarsh Shukla');

---

## 🛠️ How to Run

1. **Install Java JDK 18** and **MySQL**
2. **Clone the project**:
   ```bash
   git clone https://github.com/yourusername/electricity-bill-system.git
   cd electricity-bill-system



## database tables 

```
CREATE TABLE login( 
    meter_no varchar(30),
  	user_name varchar(30),
    name varchar(30),
    password varchar(30),
    user varchar(30)
);
CREATE TABLE customer( 
    name varchar(30),
  	meter varchar(30),
    address varchar(50),
    city varchar(30),
    state varchar(30),
    email varchar(50),
    phone varchar(20)
);
CREATE TABLE meter_info( 
    meter_number varchar(30),
  	meter_location varchar(30),
    meter_type varchar(50),
    phase_code varchar(30),
    bill_type varchar(30),
    days varchar(50)
);
CREATE TABLE tax( 
    cost_per_unit varchar(30),
  	meter_rent varchar(30),
    service_charge varchar(50),
    service_tax varchar(30),
    swacch_bharat_cess varchar(30),
    fixed_tax varchar(50)
);
INSERT INTO tax VALUES(
    '9',
    '47',
    '22',
    '57',
    '6',
    '18'
);
CREATE TABLE bill(
	meter varchar(30),
    month varchar(30),
    units varchar(30),
    total_bill varchar(30),
    status varchar(30)
);

```