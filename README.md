# 💉 Citizen Vaccine Tracker

A Java application to help the **Ministry of Health** keep track of COVID-19 vaccinations for all citizens. The system efficiently stores, manages, and processes citizen vaccination data using object-oriented principles and collection-based storage.

---

## 📖 Overview

In response to the recent rise in COVID-19 cases, the Ministry of Health initiated a system to track citizens' vaccination statuses. This project simulates a simplified version of that system. It is designed to:

- Store vaccination records for citizens.
- Record dose details such as manufacturer, date, place, and administering health professional.
- Provide quick access to statistics such as fully vaccinated individuals.
- Persist sorted data into a text file for external storage and reporting.

---

## 🧠 Features

- ✅ Add a **new citizen** to the system.
- ✅ Add a **new dose** (vaccination record) to a specific citizen.
- ✅ Track each **health professional’s details** who administers doses.
- ✅ Retrieve **number of fully vaccinated citizens** (i.e., those with 2 or more doses).
- ✅ **Save all data** to a text file, sorted by Civil ID number.

---

## 🧾 Data Model

### 🧍 Citizen

| Field          | Description                          |
|----------------|--------------------------------------|
| Civil ID       | Unique national identification number |
| Name           | Full name of the citizen             |
| Age / Gender   | *(Or other custom attributes)*       |
| Doses          | List of doses received               |

---

### 💉 Dose

| Field            | Description                              |
|------------------|------------------------------------------|
| Manufacturer     | Vaccine manufacturer (e.g., Pfizer)      |
| Date             | When the dose was administered           |
| Location         | Where the dose was administered          |
| Health Professional | Reference to the vaccinator (below)   |

---

### 👩‍⚕️ Health Professional

| Field          | Description                              |
|----------------|------------------------------------------|
| Civil ID       | Unique identifier                        |
| Name           | Full name                                |
| Experience     | Experience in years                      |

---

## 💾 Storage and Persistence

All data is stored in a **single Java collection** in memory. When saving to file:

- Citizens are sorted by **Civil ID**
- Data is written to a text file for reporting or backup

---

