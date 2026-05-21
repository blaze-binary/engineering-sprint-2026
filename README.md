# Engineering Sprint 2026 🚀

An intensive, 18-week (1,500-hour) technical upskilling sprint designed to hit the SDE-2/SDE-3 bar at Tier-1 product companies.

**Start Date:** May 1, 2026  
**Target:** 65 LPA Benchmark

## 🎯 Core Objectives
1. **Algorithmic Mastery (DSA):** Optimal, bug-free implementations within 20-30 minutes.
2. **Deep Java & JVM Internals:** Mastery over the Java Memory Model, Garbage Collection (G1, ZGC), and performance tuning.
3. **Advanced Concurrency:** Lock-free programming, custom thread pools, and multithreaded design.
4. **System Design (HLD/LLD):** Architecting highly scalable, fault-tolerant distributed systems.

## 🗂️ Repository Structure

* `dsa-sprint/`: Core algorithmic implementations grouped by pattern.
  * `arrays/` - Two Pointers, Sliding Window, Hashing.
  * *(Future packages: `trees`, `graphs`, `dp`)*
* `jvm-concurrency/` *(Upcoming)*: Dedicated Maven project for testing advanced multithreading and JVM benchmarking.
* `roadblocks.md`: A strict, running ledger of daily technical traps, edge cases missed, and lessons learned.

## ⚙️ Build & Execution

This project uses standard Maven tooling.

```bash
# Clean and compile the DSA module
mvn clean compile -pl dsa-sprint

# Execute a specific algorithm (Example)
java -cp dsa-sprint/target/classes dev.abhinab.arrays.TwoSum
