# CS20: Mac and school Eclipse

Repository: https://github.com/trobungus/cs20.git  
Branch: `master`

## Get a working school setup

If the old school setup is confusing or has a broken Pull configuration, use a fresh workspace and clone. Keep your old workspace and files; save any school work there before switching.

1. In Eclipse, choose **File > Switch Workspace > Other...**. Choose a new, writable folder named `CS20-school-workspace` in your school user folder. Eclipse restarts in an empty workspace.
2. Choose **File > Import... > Git > Projects from Git > Next > Clone URI**.
3. Set **URI** to `https://github.com/trobungus/cs20.git`. Public downloads do not require a username or token; leave the authentication fields empty for the clone.
4. On the branch page, select **master**.
5. Choose a new, empty destination folder named `cs20-school-ready` in your school user folder, separate from the workspace folder. Set **Initial branch: master** and **Remote name: origin**. Do not type a fetch reference into a branch field.
6. Continue to **Import existing Eclipse projects**. Search the clone's top folder, check all seven projects, and click **Finish**. Depending on Eclipse's version, this option appears after cloning; if the wizard closes, use **File > Import > General > Existing Projects into Workspace** and choose the clone folder. Leave **Copy projects into workspace** unchecked.
7. Open **Chapter3 > src > SkillBuilders > Rectangle.java**. Right-click the file and choose **Run As > Java Application**.

Expected Console output:

```text
The perimeter of the rectangle is 34.
```

The seven Eclipse projects are Chapter3, Chapter4, Chapter5, Chapter6, Chapter7, Chapter9, and Phidgets. There is no separate CS20 Java project to select. `SkillBuilders` exists in Chapter3; the other projects intentionally have empty source folders. Phidgets is currently an empty Java project, without hardware libraries or drivers.

## Java settings

These projects target Java 8-compatible code and use each Eclipse workspace's default Java installation. They do not require Java 25 or a Mac-specific path.

If a red error says the JRE System Library is missing, use **Window > Preferences > Java > Installed JREs**, select the school's installed JDK (Java 8 or later), and apply. If none is installed or permitted, ask the teacher to select/install the school-approved JDK. Then use **Project > Clean...** to rebuild.

## If you keep the existing school clone

In **Git Repositories > cs20 > Branches > Local**, right-click **master > Configure Branch...**. Set the remote to **origin** and its upstream branch to **master** (full reference `refs/heads/master`). Fetch from origin first if master is missing from the branch selector.

For reference, the correct underlying configuration is:

```ini
[remote "origin"]
    url = https://github.com/trobungus/cs20.git
    fetch = +refs/heads/*:refs/remotes/origin/*
[branch "master"]
    remote = origin
    merge = refs/heads/master
```

The long `+refs/heads/*:refs/remotes/origin/*` value belongs only in the fetch mapping, never in the Pull branch field. Do not delete or reset your school work to fix a Pull error. Use the fresh-workspace route above if uncertain.

After a successful Pull, import the seven projects from the clone's top folder if they are not already in Project Explorer. Pull downloads files; importing makes the projects appear in Eclipse.

## Working on two computers

Before starting work: right-click a project > **Team > Pull**. If Pull reports a conflict or unrelated histories, stop and get help rather than forcing it.

After working: save, open **Window > Show View > Other... > Git > Git Staging**, review the changes, stage the intended files, enter a message, then **Commit and Push**. Use `origin` and `master`; keep force overwrite off. If prompted, enter your GitHub username and token directly into Eclipse.

A successful push makes the files available to the other computer. Eclipse window layout, login credentials, installed JDKs, and workspace project imports do not sync through GitHub.

## ZIP fallback

If Git access fails at school but you have the backup ZIP, extract it into a new folder and import the seven projects with **General > Existing Projects into Workspace**. This provides the saved code for class, but the ZIP has no Git history or remote setup. Keep any changes you make there for later transfer into a proper clone.

Reference: https://help.eclipse.org/latest/topic/org.eclipse.egit.doc/help/EGit/User_Guide/Tasks.html
