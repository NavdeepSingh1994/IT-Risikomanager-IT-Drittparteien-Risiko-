# Riskmon – IT Risk Dashboard nach ISO 27001

**Ziel:**  
Ein einfaches, aber praxisnahes Spring-Boot-Dashboard zur Risikobewertung gemäß ISO 27001, mit Fokus auf Drittparteien-Risiken und GAP-Analysen – entwickelt im Rahmen meiner Bewerbung bei Raiffeisen (Juli 2025).

---

## Funktionsübersicht

- Eingabe von IT-Risiken (z. B. „externer E-Mail-Dienst“, „internes Tool“)
- Checkbox-Eingaben zu:
  - MFA implementiert?
  - Logging aktiv?
  - Drittparteienvertrag vorhanden?
  - ISO 27001-konform?
- Automatische Einstufung in: `Niedrig`, `Mittel`, `Hoch`
- Handlungsempfehlung basierend auf erkannten Lücken
- Frontend mit Thymeleaf, Backend mit Spring Boot
- Bewertungslogik über `RiskService` → später leicht durch Regelwerk oder ML ersetzbar

---

## Beispiel: Risikoanalyse

**Input:**
- Name: `Externer Videodienst`
- MFA: ❌
- Logging: ✅
- Vertrag: ❌
- ISO: ❌

**Ausgabe:**
- Risikolevel: **Hoch**
- Empfehlung: *„Dringende Maßnahmen gemäß ISO 27001 einleiten.“*

---

## Technologien

| Komponente       | Tech                                |
|------------------|-------------------------------------|
| Backend          | Java 17, Spring Boot 3.2.2          |
| Frontend         | Thymeleaf (HTML + minimal CSS)      |
| Datenbank        | H2 (in-memory)                      |
| Tooling          | IntelliJ IDEA, Maven                |
| Projektstruktur  | MVC Pattern                         |

---

## Warum dieses Projekt zur Stelle passt

Die Raiffeisen-Ausschreibung verlangt u. a.:

| Anforderung                                      | Umsetzung im Projekt                          |
|--------------------------------------------------|-----------------------------------------------|
| ISO 27001 ISMS verstehen & weiterentwickeln      | Bewertung nach ISO-Kontrollen                 |
| GAP-Analysen & Kontrollüberprüfungen             | 4 Checkbox-Kontrollen mit automatisierter Auswertung |
| Drittparteien-Risikomanagement                   | Checkbox: „Drittparteienvertrag vorhanden“    |
| Beratung & Maßnahmenpläne                        | Generierung von Handlungsempfehlungen         |
| Tools: Java, Projektmanagement, Eigenverantwortung | Eigenständig gebautes Java-Tool mit PMA-Ansatz|

---
# Abschluss Bachelorstudium<br/>
  Offene Bachelorprüfung: 29.09 - 04.10.25<br/>
  Abschluss: B.Sc. in Computer Science and Digital Communication<br/>
  Spezialisierung: Künstliche Intelligenz<br/>

# Geplante Zertifizierung<br/>
  PMA Level D (Projektmanagement Austria): Prüfung am 17.06.2025 - done - Warte auf das Egebnis<br/>
  Scrum Master PSM I: Prüfung am 11.08.2025<br/>
  Ing.-Titel: Antragstellung durch, warte auf einen Termin<br/>
  
# Projekterfahrung als Projektverantwortlicher / Consultant<br/>
  Projektzeitraum: 01.03.2020 – 30.06.2020<br/>
  Aufgabe:<br/>
  Training von 3 indischen Kollegen via Webex auf der SaaS-Plattform „Allianz Business System (ABS)<br/>
    → Fokus: Incident Management<br/>
  Erfolg:<br/>
  Das Team besteht bis heute und wurde als Incident-Team etabliert
  Rolle:
  Projektleitung – inklusive Schulung, Koordination, Wissenstransfer

# Warum IT-Risikomanager/IT-Drittparteien-Risiko <br/>

Ich bringe fundierte Erfahrung aus dem IT-Betrieb und dem Incident Management mit, insbesondere im Umgang mit komplexen Störungen, Eskalationen und technischen Analysen im 3rd Level Umfeld. In meiner aktuellen Rolle arbeite ich eng mit Plattform- und Sicherheitsteams zusammen und habe ein tiefes Verständnis für Abläufe im operativen Betrieb entwickelt.

Mit meinem technischen Hintergrund in Java und meiner Projektmanagement-Zertifizierung (PMA Level D) kann ich Risiken nicht nur erfassen, sondern auch strukturiert bewerten und dokumentieren. Dieses Projekt zeigt exemplarisch, wie sich zentrale Anforderungen wie Drittparteien-Risikomanagement, Kontrollüberprüfungen und Maßnahmenplanung in ein eigenständig entwickeltes Bewertungssystem überführen lassen – praxisnah, erweiterbar und auf ISO 27001 ausgerichtet.

Ich bin bereit, Verantwortung zu übernehmen und die Weiterentwicklung des IT-Risikomanagements im Sinne der 2nd Line of Defence aktiv mitzugestalten.

# Sprachen<br/>
  Deutsch & Englisch:<br/>
  Beide auf C1-Niveau (Nachweis: Berlitz Sprachinstitut, 2018, Aufstufung von B2 auf C1)<br/>
  
# Persönliche Weiterentwicklung<br/>

  Master in AI ab 2028 auf der FH Technikum Wien, Donnerstag und Freitag am Abend vor Ort<br/>
  PMA Level C Zertifikat ab 2026<br/>
  
# Private Interessen<br/>
  Sprachlich:<br/>
  Kroatisch lernen für familiäre Integration (Ehefrau ist Kroatin)<br/>
  Super Smash Bros Ultimate - wieder an Turnieren teilnehmen<br/>
  Kampfsport:<br/>
  Ab heute 19 Uhr: Wiedereinstieg in Krav Maga, Ziel: Schwarzer Gurt / Level 5<br/>
  3x die Woche Kraftsport und jeden Tag 10000 Schritte<br/>
  Autodiktisches Lernen um mein Skillset in Python und Java zu erweitern damit tieftechnische Wissen in Projekten aufgebaut wird.
