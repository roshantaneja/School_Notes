# Home-Plate
Plaintext based Organizations for SHP Robotics

# What is this even for?

This is a repository for the SHP Robotics Club to store all of our documents and files. It is a plaintext based system, so that we can easily edit and collaborate on documents. It is also a git repository, so that we can track changes to our documents over time, and revert to previous versions if we need to.

# Roshan, Why did you make this?

If youve ever worked on a project with other people, you've probably been here before: bad software, constantly changing processes and lots and lots of meetings.

Ive discussed some of thes problems with other people, and they all seem to agree that the problem is that we are using the wrong tools.

We can solve all of these problems in a single blow:

The secret?

```
"In order to do more, you must have the discipline to do less."
   - Greg McKeown
```

Ill mention, that not a lot of the Ideas I am going to mention are new, they've been well understood in the start-up world for a long time; but regression to the mean is prevalent.

Its not just enough to argue for good tools today, you must stop the future churn of new absent processes that solve the same things in different ways but equivalent ways. You do this with a Ulysses pact.

### What is a Ulysess pact?

In the Oddyssey, Oddysseus (confusingly called Ulysses in English Literature) had to travel through siren-infested waters. This was a well understood problem in his world; sailors would put wax in their ears so they couldnt hear the sirens and be lured to their deaths. But Oddysseus had a challenge: He WANTED to hear the sirens' beautiful song. He certainly didnt want to drown either, so he came up with a solution: He had his crew tie him to the mast of the ship, and to ignore any of his pleas to be untied. This way, he was able to guard against future bad descisions he knew he would make by setting up a framework to control his future self. This is the Ulysses pact, and its a very common trick.

Some examples of Ulysses Pacts:
- Leaving your credit card or keys at home when you go out to drink
- publishing a warrent canary on your company's website
- **standardizing all your tools on plain text** (wink wink)

In the future, me or my successor, may be tempted to try the new "hottest project management software" or "newest collaboration tool" or "newest file sharing service". While it might be good for a while, the act of changing tools constantly is an enormous overhead for your team, and give the lasting impression that anything that they write may soon be legacy very soon. So why bother?

Tying yourself to the mast, (like Odysseus) and standardizing on a single tool, and not only that, but a plaintext tool, means your data will live on forever, and the network effect can make it more and more valuable over time, instead of less and less.


```
"The greatest problem in communication is the illusion that it has been accomplished."
   - William H. Whyte
```

# Why?

Teams of people need to be on the same page. Both literally and figuratively. The natural way to do this is by talking to one another, but talking is not "scalable" and is extremely impermenant. After the soundwaves have bounced off the walls and reverberated for a second...

The words are gone. and whats left is our memory of them.

```
"The difference between science and screwing around is writing it down."
   - Adam Savage
```

Human memory is extremely unreliable (citation needed), subjective and is not a good way to store information. After a meeting, it is not apparent that everyone has agreed upon exactly the same thing. And now you need another meeting to double-check that. We need to write things down. But how?

### Documentation-First Teams

The solution is documentation. Communication is most reliable when it is in black and white. Everyone understands this, from 10,000 page government specifications to an email sign-off from the client youre making a 3 minute track for. Yes, have more immediate conversations by video, or chat, but write down what you concluded, and get the other person to confirm it. 


### "Documenting Architecture Decisions" (ADR) By Michael Nygard

You can improve every part of your team by recording what descisions you have made and WHY, in a system that allows for discussion and improvements. The ADR process is excellent for this, for example. There are a thousand competing apps that claim to solve these problems for you. These apps all reinvent the wheel in their own way, and new ones are being released every week. Ive used some of them, perhaps you have too, and they are all terrible.

But there is a group of people who are extremely practiced at managing enormous distributed concurrent text projects: Programmers. An an example, if you use google docs, your small team can collaborate on a few file a day, in a drive of perhaps a few hundred files. But just like in most other documentation systems, that wont scale. Programmers have been using plaintext for decades, and have developed a set of tools and processes that are extremely effective at managing text. They simultaneously edit numerous files a day, across repositories of data so numerous that we dont keep count. What are programmers using, and can non-programmers use it too?

### Git and Github

The answer is yes, yes you can. From simple code-hosting beginnings, github has grown to be so much more than that, trusted by the largest companies in the world. The foundation of my ideal team uses the raw materials that github has given us. What are the raw materials?

#### The Repository "Repo"

The foundational unit in github is the repo. This does just correspond with one git repository, but one logical "project" or subproject. Organizational tools like the Wiki (for documentation), Projects (for project management) and more can sit here, right next to your projects files, right where you need them.

#### Wikis

Each repository has a wiki, a folder of linked markdown files that anyone with access can edit, either in the friendly web editor, or by cloning the repo with git on their own computer and doing whatever they like. This is the minimum viable documentation tool, and its useful for when git's full collaboration system isnt needed, and you just want to throw some linked markdown files together.


#### Markdown

github, and most of the internet have standardized on markdown, (WIP)








# How do I use this?