# EcoAPI 🔗

**EcoAPI** is a standardized **interface layer** for Hytale economy systems.

It does **not** handle money storage or transactions itself. Instead, it provides a set of abstract methods and interfaces that allow:
1.  **Economy Plugins** (Providers) to implement their own banking logic (SQL, JSON, etc.).
2.  **Gameplay Plugins** (Consumers) to interact with the economy (shops, jobs, etc.) without depending on a specific economy plugin.

---

## ❓ Why EcoAPI?

### 🛠 For Developers
* **Decoupling:** Write your plugin once. It will work with *any* economy plugin that implements EcoAPI.
* **Standardization:** Use a unified set of methods (`getBalance`, `addBalance`, `removeBalance`, `setBalance`) regardless of the underlying system.
* **Flexibility:** Switch the backing economy system without breaking dependent plugins.

### 🎮 For Users / Server Owners
* **Compatibility:** Allows you to use a Shop plugin from Developer A and a Banking plugin from Developer B together seamlessly.
* **Freedom:** You are not locked into a single specific economy plugin. You can swap implementations whenever you want.

---

## 📥 Installation Guide (For Users)

**Note:** EcoAPI does nothing on its own. You need **three** things for a working system:
1.  **EcoAPI** (This plugin).
2.  An **Implementation Plugin** (A plugin that actually stores the money and "implements" EcoAPI).
3.  Any **Consumer Plugins** (Shops, Kits, Jobs, etc.).

**Steps:**
1.  Download the latest release from the [Releases](../../releases) page.
2.  Place the `.jar` file into your server's `plugins` folder.
3.  Ensure you also install a compatible **Economy Provider** plugin.

---

## 💻 Integration Guide (For Developers)

Since EcoAPI is not yet hosted on Maven Central, you must install it into your **local Maven repository** to use it as a dependency.

### Step 1: Install Locally
1.  Download the latest release from the [Releases](../../releases) page.
2.  Publish the artifact to your local cache with the following command (Maven)
```bash
mvn install:install-file -Dfile=Path/To/EcoAPI.jar -DgroupId=com.dunystudios.hytale.plugins -DartifactId=EcoAPI -Dversion=1.0-SNAPSHOT -Dpackaging=jar
