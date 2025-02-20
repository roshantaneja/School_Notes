---
tags:
  - CS
---
# The Unreasonable Effectiveness of Plaintext

---

# First World Problems

If you've ever worked on a project with other people, you've probably been here before: bad software, constantly changing processes and lots and lots of meetings.

I've discussed some of these problems with other people, and they all seem to agree that the problem is that we are using the wrong tools.

We can solve all of these problems in a single blow:

The secret?

```
"In order to do more, you must have the discipline to do less."
   - Greg McKeown
```

---

### Rework Book

I'll mention, that not a lot of the Ideas I am going to mention are new, they've been well understood in the start-up world for a long time; but regression to the mean is prevalent.

It's not just enough to argue for good tools today, you must stop the future churn of new absent processes that solve the same things in different ways but equivalent ways. You do this with a Ulysses pact.

---

### What is a Ulysses pact?

In the Odyssey, Odysseus (confusingly called Ulysses in English Literature) had to travel through siren-infested waters. This was a well-understood problem in his world; sailors would put wax in their ears so they couldn't hear the sirens and be lured to their deaths. But Odysseus had a challenge: He WANTED to hear the sirens' beautiful song. He certainly didn't want to drown either, so he came up with a solution: He had his crew tie him to the mast of the ship, and ignore any of his pleas to be untied. This way, he was able to guard against future bad decisions he knew he would make by setting up a framework to control his future self. This is the Ulysses pact, and it's a very common trick.

Some examples of Ulysses Pacts:
- Leaving your credit card or keys at home when you go out to drink
- publishing a warrant canary on your company's website
- **standardizing all your tools on plain text** (wink wink)

---

In the future, I or my successor may be tempted to try the new "hottest project management software" or "newest collaboration tool" or "newest file sharing service". While it might be good for a while, the act of changing tools constantly is an enormous overhead for your team, and give the lasting impression that anything that they write may soon be a legacy very soon. So why bother?

Tying yourself to the mast, (like Odysseus) and standardizing on a single tool, and not only that, but a plaintext tool, means your data will live on forever, and the network effect can make it more and more valuable over time, instead of less and less.

---

```
"The greatest problem in communication is the illusion that it has been accomplished."
   - William H. Whyte
```

## Why?

Teams of people need to be on the same page. Both literally and figuratively. The natural way to do this is by talking to one another, but talking is not "scalable" and is extremely impermanent. After the soundwaves have bounced off the walls and reverberated for a second...

The words are gone. and what's left is our memory of them.

---

```
"The difference between science and screwing around is writing it down."
   - Adam Savage
```

Human memory is extremely unreliable (citation needed), subjective and is not a good way to store information. After a meeting, it is not apparent that everyone has agreed upon the same thing. And now you need another meeting to double-check that. We need to write things down. But how?

---

### Documentation-First Teams

The solution is documentation. Communication is most reliable when it is in black and white. Everyone understands this, from 10,000-page government specifications to an email sign-off from the client you're making a 3-minute track for. Yes, have more immediate conversations by video, or chat, but write down what you concluded, and get the other person to confirm it. 

---

### "Documenting Architecture Decisions" (ADR) By Michael Nygard

You can improve every part of your team by recording what decisions you have made and WHY, in a system that allows for discussion and improvements. The ADR process is excellent for this, for example. There are a thousand competing apps that claim to solve these problems for you. These apps all reinvent the wheel in their way, and new ones are being released every week. I've used some of them, perhaps you have too, and they are all terrible.

But there is a group of people who are extremely practiced at managing enormous distributed concurrent text projects: Programmers. An example, if you use Google Docs, your small team can collaborate on a few files a day, in a drive of perhaps a few hundred files. But just like in most other documentation systems, that won't scale. Programmers have been using plaintext for decades, and have developed a set of tools and processes that are extremely effective at managing text. They simultaneously edit numerous files a day, across repositories of data so numerous that we don't keep count. What are programmers using, and can non-programmers use it too?

---

## Enter Git

The answer is yes, yes we can.

I recommend you use the most popular distributed version control system on the planet: Git.

You'll use this through one of the many git web hosts, the largest of which is GitHub, which I recommend for most people.

---

# Why Popularity Matters

Though I mention GitHub primarily in this video, I'm not sponsored by them, or anything like that, I just acknowledge that popularity matters.
Support, experience, and integrations with other services will all be far, far easier if you use the standard.

All these tools started as a web interface around the incredible tool: Git.

---

## Aside

### Linux and Git

By the way, the creator of Linux, Linus Torvalds, also later created git, to solve the problem that he created: that the Linux project had become SO LARGE that existing plain text collaboration tools were not scaling.

He jokes that he named his first project, Linux, after himself, and so it was natural to name the second one after himself too!

---

## Github Et Al. Are greater than the sum of their parts

The answer is yes, yes you can.
From simple code-hosting beginnings, GitHub has grown to be so much more than that, trusted by the largest companies in the world. The foundation of my ideal team uses the raw materials that GitHub has given us. What are the raw materials?

---

#### The Repository "Repo"

The foundational unit in GitHub is the repo.

This does not just correspond with one git repository, but one logical "project" or subproject. 

Organizational tools like the Wiki (for documentation), Projects (for project management) and more can sit here, right next to your project files, right where you need them.

---

#### Wikis

Each repository has a wiki, a folder of linked markdown files that anyone with access can edit, either in the friendly web editor or by cloning the repo with git on their computer and doing whatever they like. This is the minimum viable documentation tool, and it is useful when its full collaboration system isn't needed, and you just want to throw some linked markdown files together.

---

#### Markdown

GitHub, and most of the internet have standardized on markdown, just like Slack, Discord, many chat forums, and occasionally, Facebook, depending on the phase of the moon. They all format text using this lightweight standard called markdown. Markdown is my favorite text format, its really simple to use and designed to look good either rendered or as plaintext, unlike HTML which is unreadable to most people unless rendered in a browser. 

Here we've got a heading, denoted by the hash symbol, italic with underscores, bold with double asterisks, and links using this bracket pairing syntax. There are a few more options available, which you can look up at markdownguide.org, but this is the overwhelming majority of formatting you'll need on a day-to-day basis.

The genius of storing your data in this universal plain-text format is that should you wish to migrate from GitHub to another similar platform, your data is portable and under your control. GitHub formats Markdown very nicely, but you can export it in any format you like, and edit it with any tool you like, present and future.

Including my favourite tool here, Obsidian.

Markdown keeps your team focussed on what is important by allowing you just enough formatting, but no rich customisation options. You're not making a beautiful client brochure, so you shouldn't use 90's desktop publishing tools to make your company's critical documentation.

---

#### Issues

Though not part of the git system, Issues are a natural addition that all git hosts have implemented: A simple task system for capturing work that needs doing. These could be new features, customer requests, bug reports, or ideas. They have a rich comment thread for discussion, can be assigned to team members, and tagged with custom tags. This minimum viable project management system could be all you need. Certainly, for a solo or small team, capturing requirements in Issues might be enough.


---

#### Milestones

But if you need more, you need Milestones. GitHub milestones are a grouping of issues with a deadline. They typically represent a target, a release, or something the team is working towards. Milestones just have a title, a description, and a date. No burndown charts, no swim lanes, no complex statistics, just a progress bar. This might be enough project management for you.


---

#### Projects

If not, it is time for GitHub Projects. Each GitHub repo, team, and organisation can have a project board, a lightweight kanban board with customisable columns, allowing you to group your issues together, and observe their progress through your current iteration. This represents the information radiator for your team, a bird's-eye view of what is happening with the project, and something you might gather around for your morning catchup meeting.

You don't need all the features of Trello, JIRA, or anything like that. You need the minimum viable board. This bare-bones tool completely side-steps 'the JIRA effect', which is if you have a tool that is packed full of time tracking, velocity points, and so on the temptation is to use all these features, even if they give no value and complicate your processes. If you have one meeting a day, it should be a standup. Good standups replace other meetings and accelerate your project dramatically.

---

#### Organisations

Back to GitHub. GitHub provides an umbrella group of users called an organisation. This is your company, and if you're building your products in the open, as I recommend you do, you won't pay GitHub a thing. Most git hosts provide their services for free for open-source companies. If you have too much money, you can pay GitHub for a plan to make your data closed. If you require more subdivision, Organisations are divided into Teams.


---

#### Teams

Teams on GitHub allow you to granularly scope repo, project, wiki, and other permissions to the different teams in your organisation. I recommend allowing everyone to write and contribute to all projects, you want the network effect and low admin overhead. This pattern is called "internal open source". But if you wish, perhaps for regulatory reasons, read and write access to repos can be restricted by team.


---

#### Pull Requests

Now we're getting into the detail of GitHub.
I adore pull requests, sometimes called merge requests in other systems.
PRs represent a change to the files in a repo, with an explanation of what you did, some links, and a discussion.

---

#### Pull Requests (Diff)

After the discussion is satisfied, perhaps as simply as a colleague saying "LGTM" or as heavy weight as a full change review with an audit trail that would satisfy a bank, the changes are merged into the repo.

PRs can have powerful automation, called Actions

---

#### Github Actions

PRs and actions can run your company for you if you let them.
Though Actions were built for running tests on source code, with a little imagination, they can be used for anything:
- If you're uploading vector images, an action can build all the rasterised resolutions the client wants.
- If you're uploading video or audio clips, an action can run them through plugins to remove noise, add a music track, and upload the draft to YouTube.
- If you're checking in company documents, an action can simply spellcheck it.

Actions can run hundreds of times an hour, always adhere to best practice, and never make mistakes.

Automating your company gives you an enormous competitive speed and quality advantage.

---

## Language Tool On Premise

You could also, for example, set up style guide enforcement, blocking the PR if the phrase "on premise" has been found.

---

## NVME SSD

When your company's code, visual assets, and administration, are all in git repositories, you gain another huge superpower.

All of this becomes accessible offline.
Every file, every photo, every design, and document can be on your computer.
The magic of offline isn't necessarily that you don't need the internet (though that is a handy feature on a plane)
But that it's FAST, the data is RIGHT HERE on your computer, and you can do ANYTHING with it.
If you need to change the company's name across 10,000 files, it's trivial. It's find and replace.

If you, instead, had 5-15 different web services that you scattered all your team's data across, you'd have to log in to each one, and hope they had the feature to find and replace within their own walled garden.

Most, somehow, don't have this basic feature.

---

# Who is Flying this thing?

GOOGLE DOCS doesn't have this basic feature: you can't find and replace across a drive of files!?

And the reason for this, I suspect, is that would be TERRIFYING, wouldn't it? What if a new hire accidentally did that, you'd have to roll back all those files manually, that could take days!

But with git, it would be a PR, clearly showing what was happening, and mistakes are trivial to fix.

Plain-text files, with just enough Markdown syntax to convey meaning, allow you and your team to work with this data in the way that they want, not the way that google or Atlassian or WHOEVER thinks is best.

Doesn't this take up a lot of space on your disk?
Not plain text.
But even if you're storing large files, storage is cheap if you're smart.
A topic for another video, perhaps.

---

# Future-Proofing

The benefits of git, especially for teams already using it for code and text collaboration, are that
1. you're already paying for it, and
2. It's never going away.

It is impossible to imagine a management reshuffle that might decide on another tool just because it is the flavour of the month.
Git and GitHub dominate the coding world, and I recommend GitHub not only because it is the biggest but also the most featureful.

---

# Killed By Google

Even if you don't think git and plain text are the best option, I still suggest you use them because stability is far, far better than a constantly churning tool choice, as staff come, and go and fashions change, and Google decommission ANOTHER product.

RIP Jamboard :-(

---

ou can't do all these utopian things in most companies, I'm painfully aware.

But you CAN do SOME of these things, even just in your immediate team, or only for yourself.

I'd be interested to know what other ways good teams buck the hype cycle in favour of sane, evidence-based improvements.

Thank you.

---

# Conclusion

And now we come to the big reveal.

I have developed this entire slideshow in markdown, and parsed it into a pdf slideshow using a generic pdf parser.

Show the code.

---

# Thank You!