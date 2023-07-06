---
tags: [USHISTORY]
---
THE INTERNET, INNOVATION, AND INTELLECTUAL
PROPERTY POLICY
Philip j. Weiser*
The Internet continues to transform the information industries and
challenge intellectual property law to develop a competition policy strategy to
regulate networked products. In particular, inventors of “information plat-
forms" that support the viewing of content—be they instant messaging sys-
tems, media players, or Web browsers—face a muddled set of legal doctrines
that govern the scope of available intellectual property protection. This un—
certainty reflects a fundamental debate about what conditions will best facili-
tate innovation in the information industries—a debate most often played
out at the conceptual extremes between the “commons” and “proprietary con-
trol” approaches to the Internet and intellectual property policy.

This Article proposes a “competitive platforms mode " as a new concep-
tual framework to govern intellectual property and Internet policy. This
model suggests that where information platforms will continue to face com-
petitive alternatives, intellectual property law and policy should encourage
competition among them as a means of driving companies to develop supe-
rior products and enabling them to appropriate rewards from their inven-
tions. Alternatively, where a particular information platform merges as the
dominant one—for example, in the case of Microsoft Windows in the market
for PC operating systems—intellectual property protection against the reverse
engineering of its platform standard or user interface should recede. As a
strategy to implement the competitive platforms model, this Article proposes a
reformulation of the fair use and misuse principles—as developed in both.
copyright and patent law-—-to provide a unified, clear, and coherent frame-
work for protecting platform standards and user interfaces. Moreover, the
competitive platforms model calls upon industry standard—setting bodies and
the federal government to reassume the critical coordination and funding
roles they served in the early days of the Internet in order to support the
development of the parts of the Internet’s information infrastructure that are
intrinsically open to all and thus are vulnerable to underinvestment.

* Associate Professor, University of Colorado School of Law and Department of
Interdisciplinary Telecommunications. Thanks to Kathy Applegate, Linda Bosniak. Curt
Bradley, Christina Burnett, Julie Cohen. Stacey Dogan, Chris Eisgruber, Brett F rischmann,
Ellen Goodman, Oren Gross, Dirk Hartog, Michael Katz, Mark Lemley, Doug Lichtman,
Harry Litman. Tom Lookabaugh, Viva Moffet, Hiroshi Motomura, Tom Nachbar, Jon
Nuechterlein, Dale Oesterle, Scott Pepper, Gil Seinfeld. jim Speta, Heidi Wald. Steve
Williams, and Tim Wu for helpful comments and encouragement. I also want to thank
Jennifer Laurin for a superb editingjob andjane Thompson for stellar library assistance. I
presented earlier versions of this Article at the Princeton University Law and Public Affairs
Program, the University of Colorado Summer Workshop Series, and the 29th Annual
Telecommunications Policy Research Conference. Finally, 1 acknowledge the generosity of
the Law and Public Affairs Program Fellowship at Princeton University, which supported
my work on this project.

5342003]
INTELLECTUAL PROPERTY POLICY
TABLE OF CONTENTS
INTRODUCTION ..................................................

I.

AN INTRODUCTION TO THE INTERNET AND INTELLECTUAL
PROPERTY POLICY .........................................
A. How the Internet Works and How It Got Started .....
B. Information Platforms and Reverse Engineering ......
C. Intellectual Property Law and the Development of
Platform Standards ...................................

II. THE CURRENT STATE OF INTELLECTUAL PROPERTY LAw’s
TREATMENT OF REVERSE ENGINEERING .....................
A. The Legal Status of Reverse Engineering .............
1. Legal Underpinnings .............................
2. Reverse Engineering in Practice ..................
B. Putting the Reverse Engineering Debate in Context . .
III. THE CURRENT BATTLE IN INTELLECTUAL PROPERTY THEORY:
THE COMMONS MODEL VERSUS PROPRIETARY CONTROL .....
A. The Commons Model and Its Critics .................
I. The Commons Model ............................
2. The Failings of the Commons Theory ............
B. The Proprietary Control Model and the
Schumpeterian Justiﬁcation ..........................
l. The Proprietary Control Model ...................
2. The Failings of the Proprietary Control Theory . . .
IV. TOWARD A COMPETITIVE PIATFORMS MODEL FOR THE
INTERNET AND THE INFORMATION INDUSTRIES ..............
A. The Competitive Platforms Model and Intellectual
Property Law Reform ................................
1. Rival Platform Standards .........................
2. Competition Within a Standard ...................
B. The Competitive Platforms Model, the Role of
Standard-Setting Bodies, and Government Funding of
Research and Development ..........................
V. TOWARD A COMPETITIVE PLATFORMS CONCEPTION OF THE
LEGALITY OF REVERSE ENGINEERING ........................
A. The Challenge of Converging Platforms and
Connectix .............................................
B. A Model for Horizontal Access Regulation: Lotus v.
Borland ..............................................
C. Possible Objections to a Competitive Platforms-Based
Approach to Reverse Engineering ....................
CONCLUSION ....................................................

INTRODUCTION
535
535
541
541
545
549
552
552
552
560
564
568
568
569
573
576
576
579
583
583
585
591
594
600
601
604
608
612
The Internet presents a formidable challenge to intellectual prop-
erty policy. In particular, the continuing evolution of the hardware and
software infrastructure that supports Internet content gives rise to radi-536 COLUMBIA LAW REVIEW [Vol. 103:534
cally different visions for how intellectual property law should regulate
the Internet’s software infrastructure. One vision, often associated with
Lawrence Lessig, suggests that the Internet should be an “information
commons" built on open source technologies.l Resisting this call for a
categorical commitment to openness, others champion a proprietary de-
velopment model along the lines of Microsoft’s role in the computer op-
erating systems market.2 This Article rejects both perspectives, proposing
a “competitive platforms model” to guide intellectual property policy in
the Internet age. This model embraces proprietary development where
there is competition between rival platform standards, but calls for open
standards where a single platform standard wins out or where rival ﬁrms
would not seek to invent a proprietary standard at all.

The competitive platforms model both recognizes the signiﬁcance of
the Internet's nonproprietary roots and seeks to facilitate the proprietary
investment that will help shape the Internet’s future. The Internet devel-
oped in a nonproprietary environment in which the US. government
supported and a disparate array of developers contributed to its growth
without focusing on proﬁts. Notably, this environment produced the In-
ternet’s basic standard—the Transmission Control Protocol and Internet
Protocol (TCP/IP)—that facilitates the routing of Internet communica-
tions and enables the Internet to function as a "network of networks."3
To this date, this basic platform standard remains nonproprietary: “No
one owns [it], no one licenses its use, and no one restricts access to it."4
I. See Lawrence Lessig, Code and Other Laws of Cyberspace 6—8 ( 1999) [hereinafter
Lessig, Code]; Lawrence Lessig, The Future of Ideas: The Fate of the Commons in '4
Connected World 26 (2001) [hereinafter Lessig, Future of Ideas]. As others have
explained, Lessig's vision of a commons—as well as his criticisms of proprietaty control—is
ultimately nuanced, but his prose tends to suggest a black or white choice. See Sonia K.
Katyal, Ending the Revolution, 80 Tex. L. Rev. I465. 1471 (2002) (reviewing Lessig, Future
of Ideas, supra).

2. See, e.g., R. Polk Wagner, Information Wants to Be Free: Intellectual Property and
the Mythologies of Conuol. 103 Colum. L. Rev. (forthcoming 2003) (manuscript at 43—44.
on ﬁle with the Columbia Law Review). available at http://wwaaw.upenn.edu/polk/'
wagner.control.pdf (“To the extent that a policy goal is to increase the amount of
informational content accessible via the Internet. extending rights to creators-owners in
this new medium will be beneﬁcial.").

3. Philip‘]. Weiser, Internet Governance, Standard Setting, and Self-Regulation, 28 N.
Ky. L. Rev. 822, 825 (2001) [hereinafter Weiser, Internet Governance]. The tnost salient
features of the Internet are its reliance on the basic TCP/IP standard, see infra note 21,
and its interconnected nature. See Reno v. ACLU, 521 US. 844. 849 (1997) (deﬁning the
Internet as “an international network of interconnected computers"). Congress, for
example, has focused on these two attributes in deﬁning the Intemet. See 47 U.S.(.I.
§ 230(f) (I) (2000) (deﬁning the Internet as "the international computer network of both
Federal and non-Federal interoperable packet switched data networks”); id. §23l(e)(3)
(deﬁning the Internet as “the combination of computer facilities and electromagnetic
transmission media, and related equipment and software, comprising the interconnected
worldwide network of computer networks that employ the Transmission Control Protocol/
Internet Protocol or any successor protocol to transmit information”).

4. Jason Oxman, Fed. Communications Comm'n, The FCC and the Unregulation of
the Internet 5 (Office ofPlans and Policy, Working Paper No. 31. l999), available at httpz/2003] INTELLECTUAL PROPERTY POLICY 537
This open platform standard (like the standard gauge developed for the
railroad industry) has enabled Internet application developers to create
new products and services and users to adopt those products easily,5
thereby creating a virtuous circle of an increasing number of applications
and users for Internet products and services.6 Most importantly, the ﬁrst
popular uses for the Internet—e-mail7 and the World Wide Webs—were
both noncommercial inventions that beneﬁted from government support
and helped to establish the Internet as a popular platform for other in-
ventions, such as Napster.

During the Intemet’s early years, the US. government supported
and encouraged a culture of nonproprietary development that self-con-
sciously protected the Intemet’s open and layered architecture.9 The es-
sence of this open architecture was a commitment to using a platform
standard that both Internet users and providers of Internet content (and
services) could access easily without either limits on the use of the net-
work or proprietary gatekeepers who could charge for access to the stan-
dard. In the wake of the government’s decision to allow commerce on
the Internet and to privatize its infrastructure, the Intemet’s software
/www.fcc.gov/Bureaus/OPP/working_papers/oppwp31.pdf (on ﬁle with the Columbia Law
Reuiew).
5. Philip Evans 8c Thomas S. Wurster, Blown to Bits 33 (1999).

6. As Timothy Bresnahan put it, “platform standards are hard to stop, hard to start,
and easy to maintain. A platform needs a critical mass of adopters and a critical mass of
complementary software (and sometimes other components)." Timothy F. Bresnahan,
New Modes of Competition: Implications for the Future Structure of the Computer
Industry, in Competition, Innovation and the Microsoft Monopoly: Antitrust in the Digital
Marketplace 155, 161 (Icffrey A. Eisenach 8: Thomas M. Lenard eds., 1999) (proceedings
of a conference held by the Progress and Freedom Foundation, Wash., DC. Feb. 5, 1998).

7. For a discussion of the invention of e-mail, seejanet Abbate, Inventing the Internet
108—09 (1999).

8. The World Wide Web is a system of powerful computers (servers) connected to the
Internet that supports documents formatted in the HyperText Markup language
(HTML). HTML documents support links to other documents, as well as to multimedia
programs that use graphics, audio. and video ﬁles. In practice, this system enables users to
move from one document to another simply by “clicking" on “links” contained in an
HTML-formatted document. (Signiﬁcantly, not all servers connected to the Internet are
part of the World Wide Web; some focus solely on e-mail, for example.) The key
application that enables users to access the World Wide Web is the “Web browser,” such as
the now-dominant Microsoft Internet Explorer and the once-dominant Netscape
Navigator. See Webopedia, World Wide Web, at http://www.webopedia.com/TERM/W/
World_Wide_Web.html (last visited Oct. 23, 2002) (on ﬁle with the Columbia Law Rzuiew)
(deﬁning World Wide Web); Abbate, supra note 7, at 214—18. For a description of the
Web’s creation by its inventor, see Tim Bemers-Lee, Weaving the Web (1999).

9. For a succinct history of the government's role in developing the Internet, see
Edward L. Rubin, Computer Languages as Networks and Power Structures: Governing the
Development of XML, 53 SMU L. Rev. 1447, 1449—52 (2000); see also Abbate, supra note
7, at 54—60 (recounting government coordination and use of researchers to help develop
Internet).538 COLUMBIA LAW REVIEW [Vol. 103:534
(and physical) infrastructure has become increasingly owned and con-
trolled by commercial enterprises.”
The role of intellectual property law in regulating the software infra—
structure for the Internet in particular and information platforms more
generally will increasingly resemble that of telecommunications law in
regulating the physical wires that connect Internet users.1 1 Thus, to regu-
late the Internet’s basic standards and future development effectively, in-
tellectual property law must develop a competition policy strategy. In this
regard, its critical challenge will be to protect investment incentives that
facilitate innovation while at the same time ensuring open access to domi-
nant software products that could impede innovation and competition by
denying access to their platform. Unfortunately, the current state of in-
tellectual property law is not well suited to handle this task.l2
The debate over open access to software products taps into a long-
unsettled area of intellectual property law.l3 In particular, the courts
10. For a discussion of the decision to commercialize the Internet, see infra notes
27—32 and accompanying text.

11. As to telecommunications law, commentators are actively debating whether
regulation should provide for “open access" to privately owned physical broadband
infrastructure to ensure that all Internet Service Providers enjoy equal access to Internet
users. Compare, e.g., james B. Speta. Handicapping the Race for the Last Mile?: A
Critique of Open Access Rules for Broadband Platforms. 17 Yale j. on Reg. 39, 80—93
(2000) (questioning value of such regulation), and Phil Weiser, Paradigm Changes in
Telecommunications Regulation, 71 U. Colo. 1.. Rev. 819, 830—31 (2000) (same), with
Mark A. Lemley 8: Lawrence Lessig. The End of End-to-End: Preserving the Architecture
of the Internet in the Broadband Era, 48 UCLA L. Rev. 925. 930—40 (2001) (championing
such regulation). As for the future of open access to Internet-related software products
regulated by intellectual property law, there are only the very beginnings of an
appreciation for how intellectual property law needs to address open access claims for an
Internet age. See Francois Bar 8.- Christian Sandvig, Rules from Truth: Post-Convergence
Policy for Access 15 (Sept. 2000), at http://www.stanford.edu/~fbar/Pub1ications/
Rules_fr()m_Truth.pdf (on ﬁle with the Columbia Law Review) (“[Wlith digital networks,
access to network management software features is as important as access to facilities”):
Yochai Benkler 8: Alan Toner. Access to the Internet (2001), at http://eon.law.harvard.
edu/ilaw/Access (on ﬁle with the Columbia Law Rwiau) ("just as at the physical layer, if any
single company controls the logical layer—the browser or operating system, the ISP
software or the messaging platform—it can exert tremendous control over the way in
which that infrastructure is controlled").

12. See Mark A. Lemley 8: David McGowan, Legal Implications of Network Economic
Effects. 86 Cal. 1.. Rev. 479, 541 (1998) (observing that intellectual property law has not
integrated economic thought to the same degree as antitrust law); Randal C. Picker,
Copyright as Entry Policy: The Case of Digital Distribution, 47 Antitrust Bull. 423. 423—26
(2002) (noting that intellectual property law, and particularly copyright, does not follow a
clear competition policy).

13. See Raymond T. Nimmer, Copyright and Competition Norms, in Intellectual
Property Antitrust 1999, at 147, 149 (PLI Intellectual Prop., Course Handbook Series No.
0-566, 1999) (describing “ebb and flow" of changing emphasis on expansive property
rights or those tempered by competition policy); Nelson R. Capes. The Software Copyright
"Super Patent,‘ Computer Law., June 1995, at 8, 8 (noting that "courts have found
conflicting answers" on whether copyright law protects “aspecLs of [software] programs
other than the source code and object code." such as the user interfaces produced by that2003] INTELLECTUAL PROPERTY POLICY 539
continue to struggle with the question of how intellectual property law
should treat access to platform standards—which facilitate compatibility
between complementary products and services that are part of a particu—
lar system—and user interfaces—which facilitate the users’ interactions
with particular systems or products. In its last encounter with this issue in
the Lotus case several years ago, the Supreme Court divided equally, af-
ﬁrming without an opinion the First Circuit's decision not to protect such
an interface.14 Regulating access through intellectual property rules
presents a formidable challenge for judicially developed doctrine because
computer programs are eligible for protection under both copyright—as
creative works of authorship—and patent—as items of functional util-
ity.15 To be sure, both copyright and patent law include certain doctrines
that limit property rights and aim to strike the right balance between pro-
viding incentives to innovate and ensuring access to critical standards.
But these doctrines remain muddled, in part because of the unresolved
debate between the commons and proprietary control perspectives, and
thus are in need of a clear analytical framework to ensure that they serve
sound competition policy goals.

With the increasing importance of the Internet, the unresolved state
of intellectual property rules governing access to platform standards will
become even more signiﬁcant. In particular, the Internet promises to
reshape the information industries16 in its image by enabling numerous
products to use its communications standard to provide new services,
such as instant messaging, that rely on its platform standard.17 Conse-
quently, the conceptual framework used for deciding when ﬁrms can
code). In the language often used by courts interpreting the Copyright Act, this issue boils
down to the protectibility of literal copying of “non-literal” elements of a software program.
See id.

14. Lotus Dev. Corp. v. Borland Int’l, lnc., 49 F.3d 807, 819 (lst Cir. 1995), aﬂ‘d by an
equally divided Court, 516 US. 233 (1996).

15. In theory, patent law—which only protects novel, nonobvious, and useful
inventions—provides “thicker" protection for a shorter period of time than copyright.
Compare 35 U.S.C. §§ 101, 103(a) (2000) (requiring for patentability that invention be
“new and useful" and nonobvious), and id. § 154(a)(2) (specifying twenty-year term of
patent), with 17 U.S.C. §§ 102, 107—122 (2000) (providing copyright protection for
“original works of authorship ﬁxed in any tangible medium of expression" but with various
limitations on exclusive rights), and id. §§ 302—305 (specifying duration of copyright,
generally life of author plus seventy years). With respect to dynamic software markets,
however, the length of protection is often irrelevant, as patent law's twenty-year duration is
an eternity in the Internet world. Rather than focus on the length of intellectual property
protection, this Article focuses on its scope; in particular, it discusses when software
product speciﬁcations and user interfaces should be protected so that other ﬁrms cannot
make their products interoperable with the protected inventions.

16. While the precise deﬁnition of “the information industries” remains unsettled, for
purposes of this Article the term refers to Internet services, telecommunications senrices,
and software products. Some refer to these industries as the “new economy.” See Richard
A. Posner, Antitrust in the New Economy, 68 Antitrust LJ. 925, 925—26 (2001).

17. Consider, for example, the case of “Web services,” which are greatly inﬂuencing
the future of software. See infra notes 258—261 and accompanying text.540 COLUMBIA LAW REVIEW [Vol. 103:534
gain access to a platform standard will not only shape the development of
the Internet, but also all information industries that rely on platform
standards (e.g., cell phones and video game consoles). In evaluating al-
ternative frameworks to guide intellectual property policy, courts and
policymakers will need to determine what approach will best facilitate in-
novation in the development of the Internet in particular and the infor-
mation industries more generally.

This Article presents an alternative model to the commons and pro-
prietary control perspectives, setting out the competitive platforms model
and explaining how it can be applied to the Internet and the information
industries. In terms of its application to the lntemet, the competitive
platforms model would ensure a basic level of openness while allowing
for proprietary enhancements, thereby enabling developers to provide ri-
val Internet-based products and services based on technologies that are
not open to all.” Under this model, the technologies that make these
services possible would be protected (and access limited) until and unless
a particular one emerged as dominant and likely to monopolize the mar-
ket. By that time, the innovating firm would already have reaped suffi—
cient rewards to have spurred the innovation; conversely, a failure to
open a dominant standard would threaten future innovation by denying
access to ﬁrms that needed to rely on this standard to bring new products
to market.

Based on the competitive platforms model, this Article proposes a
reformulation of the intellectual property law doctrines that regulate the
copying of user interfaces or platform standards (often accomplished
through reverse engineering). Admittedly, reformulating intellectual
property policy into a uniﬁed and coherent regime based on the competi-
tive platforms model is only one component of a more comprehensive
vision for the regulation of the Internet and information industries. In
essence. the competitive platforms model calls for a policy of facilitating.
wherever possible. the development and continued survival of rival plat-
form standards (or “information platforms””’) to support different infor—
mation products and services. Where multiple platforms cannot thrive—
and where one appears set to dominate the market—the next best world
is one where different firms can all sunive based on a common and open
standard. As this Article explains, rival standards provide a number of
beneﬁts over a single open standard—that is to say, one not owned by a
proprietary ﬁrm—but a single open standard is better than a single pro—
Is. In practice. these enhanced proprietary services could provide advantages over
current Internet communications, such as heightened security, guaranteed delivery. and
synchronization (for realtime applications). See Richard Karpinski. Do Web Services Need
a Network}, lnternetWeek.com. Oct. 25. 2001. at http://www.internetweek.com,I'trans
todayOl_/ttodale250l.htm (on ﬁle with the Columbia Law Review).

19. An inlormation platform. as discussed further at infra note 33 and accompanying
text. is any product or service that ultimately enables the delivery of information, whether
it be in music. video, or text form. A media player, for example, constitutes an information
platform because it enables the delivery of music and video via the lnternet.2003] INTELLECTUAL PROPERTY POLICY 541
prietary standard controlled by a dominant ﬁrm (as is the case with
Microsoft’s Windows operating system, for example). In addition to ad-
dressing intellectual property law, this Article also explains how standard-
setting bodies and government funding of research and development can
facilitate the emergence and continued success of an open standard.

This Article proceeds in ﬁve parts. To explain the relevant historical,
technological, and legal landscape, Part I outlines the Intemet’s technical
architecture and brieﬂy explains how intellectual property law’s treat-
ment of reverse engineering will inﬂuence the future direction of the
Internet. Part II discusses in greater detail the technical and legal land-
scape of reverse engineering. Part III sets forth the competing visions of
a proprietary Internet and an information commons, and Part IV outlines
the competitive platforms model, explaining why it would provide a supe-
rior strategy for facilitating innovation. In so doing, Part IV discusses the
role of standard-setting bodies and government funding in supporting an
open platform where proprietary ﬁrms will not invest in developing pro-
prietary ones. Finally, Part V explores the application of the competitive
platforms model to reverse engineering, discussing both how it would re-
form the legal treatment of reverse engineering as well as potential criti-
cisms of such reforms.

I. AN INTRODUCTION To THE INTERNET AND INTELLECTUAL
PROPERTY POLICY
The development of the Internet and the continuing need to facili-
tate and regulate its growth have set the tone for current debates about
the information economy and the future of intellectual property policy.
To explain the backdrop for these debates, this Part ﬁrst discusses brieﬂy
how the Internet has developed thus far and how it functions, and then
connects the development of the Internet to intellectual property policy.
It concludes by outlining the legal treatment of reverse engineering,
which is one means of regulating when an inventor of an information
platform can maintain proprietary control of a platform standard.

A. How the Internet Works and How It Got Started
One helpful conceptualization of the Internet’s technical architec-
ture is to think of it as four layers that are piled on top of one another.20
At the top is the content layer, which is the level at which most users
interact with the Internet (Yahoo’s website, for example). Supporting
20. Models such as this have been developed to help describe the different functional
“layers” of Internet communication. See, e.g., IT-Director.com, TCP/IP and OS],
searchNemorking.com, Sept. 26, 2002, at http2//searchNetworking.techtarget.com/
originalContent/O,289142,sid7_gci851291,00.html (on ﬁle with the Columbia Law Retn'ew)
(describing the ISO/OSI and TCP/IP reference models). Increasingly, legal
commentators rely on a four-layer model to conceptualize the Internet’s architecture. See,
e.g., Kevin Werbach. A layered Model for Internet Policy, l J. Telecomms. 8c High Tech.
L. 37. 58—64 (2002).542 COLUMBIA LAW REVIEW [VoI. 103:534
this content layer is the application layer, which includes the browser
software to access websites and the media player software for multimedia.
At the Internet’s core is the logical layer, which consists of the basic stan-
dards—namely, the TCP/IP‘Zl—that deﬁne the nature of Internet com-
munications. Finally, at bottom, the Internet relies on the physical layer,
which involves the actual wires that are used to access the Internet and
the “backbone" infrastructure that carries information from where it is
stored to the user.

Using the four-layer model of the Internet set out above, it becomes
clear why legal scholars and most commentators have spent a dispropor-
tionate amount of attention focusing on the role that intellectual prop-
erty law plays in regulating access to content over the lntemet. For most
users, the content layer of the Internet, along with the physical layer, is
the most familiar and understandable. But the roles played by the appli-
cations and logical layers, while not appreciated by most users, are criti-
cally important. Indeed, the available applications and logical standards
constitute the Internet’s software infrastructure and make possible its va-
rious uses. Thus, rather than address the content and physical layer is-
sues that Iie at the heart of many current academic and policy debates
regarding the Internet,22 this Article focuses on how intellectual property
law and government policy can influence the future development of the
application and logical layers.

The openness of each layer of the Internet reflects not only the vi-
sion of its early pioneers and its government supporters,23 but also the
leadership of standard-setting committees like the Internet Engineering
Task Force (IETF).2“ To develop the basic Internet technologies, the
21. See supra note 3 and accompanying text. For a description of this standard, see T.
Socolofsky 8c C. Kale, A TCP/IP Tutorial 2—8 (Network Working Group, Request for
Comments No. 1180, 1991), at http://www.rfc-editor.org/rfc/rfcI180.txt (on ﬁle with the
Columbia law Review). For a discussion of how government funding and academic
research helped develop this open standard, see Abbate. supra note 7, at 122—33; Robert E.
Kahn & Vinton G. Cerf, What Is the Internet? (And What Makes It Work) 8—11 (1999).
available at http://www.policyscience.net/cerf.pdf (on ﬁle with the Columbia Law Rmimu);
see alsojames B. Speta. A Common Carrier Approach to Internet Interconnection, 54 Fed.
Comm. L._]. 225, 243—47 (2002) (describing development of TCP/IP and its effectiveness
for Internet communication).

22. For a sense of the debate over access to the physical layer. see supra note 1 l. Fora
sense of the debates related to Internet content, see, e.g., Yochai Benkler, Free as the Air to
Common Use: First Amendment Constraints on Enclosure of the Public Domain, 74
N.Y.U. L. Rev. 354. 386—94, 412—46 (1999).

23. See supra note 9 and accompanying text.

24. For an overview of the IETF, which is acknowledged to be the most important
Internet standards body. see Scott Bradner, The Internet Engineering Task Force. in Open
Sources: Voices from the Open Source Revolution 47, 47—52 (Chris DiBona et al. eds.,
1999); Internet Engineering Task Force, Overview of the IETF, at http://www.ietf.org/
overview.htm1 (last visited Oct. 23. 2002) (on ﬁle with the Columbia Law Review). For a
description of the organiuttional culture that guided the lntemet’s early development, see
Committee on the lntemet in the Evolving Information Industries, The Internet's Coming
of Age 124. 134—35 (2001) [hereinafter Intel-net's Coming of Age]. For a celebration of2003] INTELLECTUAL PROPERTY POLICY 543
government relied on a collection of engineers, who developed the In-
ternet’s key software on a nonproprietary basis.25 To keep such technolo-
gies available to all, Richard Stallman founded the Free Software move-
ment, which developed an open source license—the General Public
License (GPL)—to guarantee that any improvements to the basic code
remain free for others to use under the terms of the license.26
In the early 19905, the government decided to remove the restric-
tions on the use of the lntemet for commerce, privatize the key Internet
infrastructure, and leave it to the private sector to chart the Internet’s
future growth.27 Taken together, these steps effectively declared that the
Internet was now full grown and would no longer be fostered by direct
government subsidies.28 These steps also ended the govemment’s com-
the lETF’s decisionmaking process, see A. Michael Froomkin, Habermas@discourse.net:
Toward a Critical Theory of Cyberspace, 116 Harv. L. Rev. 749, 796—817 (2003).

25. See Bemers—Lee, supra note 8, at 73—74 (discussing placement of the Web's
software code in the public domain); Charles H. Ferguson, High St@kes, No Prisoners
50—52 (1999) (discussing development of the original Web browser); Nathan Newman,
Storming the Gates, American Prospect, Mar. 27—Apr. 10, 2000, at 35, 35 (“Largely funded
by the federal government, open-source software was the creative force behind the
explosion of the computer industry; it also drove development of the Internet and still
comprises much of the lntemet's inner workings”); Apache Software Found., Apache
HTTP Server Project: About the Apache HTTP Server Project, at http://
httpd.apache.org/ABOUT_APACHE.html (last visited Oct. 20, 2002) (on ﬁle with the
Columbia Law Rwiew) (discussing history and organization of the Apache Group,
comprised of volunteer software developers committed to “creating a . . . freely-available
code implementation of an HTTP (Web) server”).

26. See Ira V. Heffan, Note, Copyleft: Licensing Collaborative Works in the Digital
Age, 49 Stan. L. Rev. 1487, 1508 (1997) (setting out conditions of GPL). As others have
noted, there are important differences between the GPL used for innovations such as the
Linux operating system and other open source licenses (such as that used for the Apache
server) that allow for proprietary extensions that are derivative works of the original
product. See Lessig, Future of Ideas, supra note 1, at 59—60; Michael]. Schallop, The IPR
Paradox: Leveraging Intellectual Property Rights to Encourage Interoperability in the
Network Computing Age, 28 AIPLA Q]. 195, 243—48 (2000). In what open source
advocate Eric Raymond deemed a “clever" move, Microsoft recently condemned the entire
open source movement by criticizing the “controversial” form of GPL licensing as reﬂective
of the entire movement. See John Markoff, Microsoft Is Set to Be Top Foe of Free Code,
N.Y. Times, May 3, 2001, at C1 (quoting Eric Raymond). For a discussion of the various
distinctions, see Free Software Foundation, Categories of Free and Non-Free Software, at
http://www.gnu.org/philosophy/categories.html (last modiﬁed Dec. 29, 2002) (on file
with the Columbia Law Review).

27. See Scientiﬁc and Advanced Technology Act of 1992, Pub. L. No. 102-476, sec. 4,
§ 3, 106 Stat. 2297, 2300 (codiﬁed at 42 U.S.C. § 1862(g) (2000)); see also Appropriate
Framework for Broadband Access to the lntemet over Wireline Facilities, 17 FCC Rcd
3019, 3025 (2002) (noting that after a period of government support, “the lntemet
entered a commercial phase characterized by more widespread network interconnection,
an explosion of applications and access to a growing universe of websites utilizing
common, interoperable protocols”); Abbate, supra note 7, at 196—200 (explaining the
change in government policy).

28. See lntemet’s Coming of Age, supra note 24, at ix (remarking that the lntemet
has “reached its adolescence”); Kahn 8c Cerf, supra note 21, at 5 (noting that purpose of
allowing commerce on the lntemet was to use “the enthusiasm of private sector interests to544 COLUMBIA LAW REVIEW [Vol. 103:534
mitrnent to supporting an open architecture model for the Internet’s de-
velopment and invited the introduction of proprietary (and closed) stan-
dards in the Internet world.29 In particular, by calling on commerce to
take the leading role in developing the Internet,30 the government cre-
ated a gold rush for companies to introduce proprietary technologies to
the developing Internet infrastructure.-"H In developing closed, proprie-
tary standards—as opposed to open ones—companies seek to capture
more value from their inventions, maintain more control over their prod-
uct, and innovate in whatever manner and pace they chose.82 By con-
build upon the government funded developments to expand the Internet and make it
available to the general public”). One of the government’s important—and unfortunate—
steps was to invest less in the creation of open standards through, say, supporting academic
research or funding the activities of the IETF. See Internet's Coming of Age, supra note
24, at 137 (noting declining government funding for noncommercial Internet research);
Noah Green, Weaning the Net: The Feds Hand Cyberspace to the Private Sector. Village
Voice, july 11. 1995, at 41 (noting end of government support for the IETF).

29. The challenges to preserving an open architecture without intermediaries that
might act as “gatekeepers” are discussed in Marjory S. Blumenthal 8: David D. Clark.
Rethinking the Design of the Internet: The End-to-End Arguments vs. the Brave New
World, in Communications Policy in Transition: The Internet and Beyond (Benjamin M.
Compaine 8c Shane Greenstein eds., 2001). Among those forces that are leading to the
introduction of such entities are the use of the network address translation (NAT) to
create additional IP addresses. a number of quality of service (QOS) assurance
technologies, and measures that provide security. ﬁlter undesirable content, and protect
privacy (such as ﬁrewalls). See Internet's Coming of Age, supra note 24, at 7 (discussing
NATs); id. at 10, 104 (“The reality of today's Internet is that end-to-end enhancement of
QOS is a dim prospect”); id. at 143 (describing ﬁltering and ﬁrewalls); Upgrading the
Internet. Economist, Mar. 24, 2001, at 33, 34 (quoting Ray Ozzie as stating that NAT and
the increasing use of ﬁrewalls have fundamentally broken down the Internet's end-to—end
architecture).

30. See generally William 1. Clinton 8: Albert Gore. Jr., A Framework for Global
Electronic Commerce 4 (1997) (stating, as the ﬁrst principle of Internet policy, “[t]he
private sector should lead” and observing that, although the government played a critical
role in the Internet‘s development, “its expansion has been driven primarily by the private
sector”). For a discussion of this transition, seejay P. Kesan 8c Rajiv C. Shah, Fool Us Once
Shame on You—Fool Us Twice Shame on Us: What We Can Learn from the Privatizations
of the Internet Backbone Network and the Domain Name System. 79 Wash. U. LQ. 89.
107—19 (2001).

31. See Charles R. Morris 8c Charles H. Ferguson, How Architecture Wins Technology
Wars, Harv. Bus. Rev.. Man—Apr. 1993, at 86, 87 (“Simply stated, competitive success ﬂows
to the company that manages to establish proprietary architectural control over a broad.
fast-moving, competitive space”); Nicholas G. Carr, Gated Communities, Industry
Standard, Nov. 27—Dec. 4. 2000. at 178, 178 (“'There is always an incentive for one
company to try to . . . change standards and leave other companies inoperable . . . but
there‘s a tremendous incentive for the community as a whole to prevent that."' (quoting
Tim Berners-Lee)).

32. See Carl F. Cargill, Open Systems Standardization: A Business Approach 52—54
(1997) (highlighting the time and compromises necessary to forge a common standard);
Internet's Coming of Age, supra note 24. at 133 (noting how increased participation in
standard-setting bodies lowers the quality of the ultimate standard); William Lehr,
Compatibility Standards and Interoperability: Lessons from the Internet. in Standards
Policy for Information Infrastructure 121, 133, 140 (Brian Kahin 8cJanet Abbate eds.,
1995) (explaining that standard-setting committees move slowly because supermajority2003] INT ELIE CTUAL PROPERTY POLICY 545
trast, committing to open standards often results in a lowest common de-
nominator approach.

B. Information Platforms and Reverse Engineering
Information technology inventions at the application and logical lay-
ers of the Internet—or in the equivalent positions of other information
industries—can be understood as information platforms.” Stated sim-
ply, applications and logical standards constitute information platforms
because they provide a foundation for the delivery of content—be it mu-
sic, text, video games, or video—in digital form. In nearly all cases, this
platform relies on complementary products or services that use a plat-
form standard or user interface. Take, for example, Sony PlayStation’s
video game system. This product, which can be understood as an applica-
tion, supports content speciﬁcally made for it. Similarly, both a Web
browser and a media player program function in this manner, as they
facilitate the viewing of content in a compatible format. The essence of
each of these information platforms is the platform standard for which
content can be built, and the user experience created by its user
interface.

By understanding how the browser, media player, and the Sony Play-
Station all constitute applications, it also becomes clearer how the logical
layer standards play a critical role in facilitating invention. Because all
Internet users rely on connections that are compatible with the basic
technologies comprising the logical layer—and those technologies are
free and open to all—inventors like Sony can develop interactive applica-
tions without worrying about whether they will have access to the basic
Internet standard. At the same time, because there is no one custodian
charged with maintaining the logical layer standards, there is a danger
that those standards may not develop as effectively as the proprietary ap-
plications that rely upon them.

For companies developing proprietary applications that function as
information platforms, protecting their platform standard and user inter-
voting, public notice requirements, and hierarchical comment-and—review cycles afford
ﬁrms multiple opportunities to delay a standard's progress); Oﬁice of Policy Planning, Fed.
Trade Comm’n, l Anticipating the 2lst Century: Competition Policy in the New High-
Tech, Global Marketplace 27—28 (1996) (“[V]oluntary standard setting tends to occur too
slowly, too sporadically, and, in settings where proprietary control truly matters, too
infrequently to offer anything approximating a complete solution"); Morris 8: Ferguson,
supra note 31, at 89 (“Because they are set by committees, [standard-setting bodies] usually
settle on lowest-common-denominator, compromise solutions"). A related point is that by
submitting a standard to a committee for approval, a company may ﬁnd that its
competitors are able to use the standard-setting process to reduce the innovating ﬁrm’s
competitive edge. Martin C. Libicki, Information Technology Standards: Quest for the
Common Byte 12—13 (1995).

33. For a further explanation of information platforms and their legal signiﬁcance,
see Philip]. Weiser, Law and Information Platforms, l]. Telecomms. 8c High Tech. L. 1,
3—8 (2002) [hereinafter Weiser, Information Platforms]; see also supra note 19.546 COLUMBIA LAW REVIEW [Vol. 103:534
face—often through intellectual property law—is critical to enabling
them to succeed. In the case of a game console, for example, the inven-
tor may well safeguard access to its platform standard to prevent a would-
be rival from gaining access to its system and appropriating the value of
the original invention by developing a clone. Similarly, if a Web browser
(or media player) manufacturer develops a user interface that provides a
more satisfying user experience than existing alternatives, a rival can copy
that interface unless intellectual property law prevents such an attempt.

The Intemet’s initial development relied on signiﬁcant government
support and the collaboration among academics and programmers who
developed most of the core software and protocols for Internet-related
standards. This development path can be justiﬁed by the fact that the
Internet‘s most basic protocols (like the TCP/IP standard) constitute
classic public goods that would not necessarily be provided by the mar-
ket.-“4 In particular, these open standards beneﬁt all users enormously,
but no single user is able to appropriate enough of their beneﬁts in order
to have had the incentive to create them in the ﬁrst place.35 For such
basic standards, intellectual property law confronts a dilemma: Allowing
one ﬁrm to control such standards on a proprietary basis may prevent the
technology from gaining adopters, while not allowing the inventor to
reap some rewards from an invention will fail to provide an incentive for
ﬁrms to innovate in the ﬁrst place.36 Because of this public goods quality
of information, intellectual property law’s treatment of information plat-
34. See Brett Frischmann, Privatization and Commercialization of the Internet.
Infrastructure: Rethinking Market Intervention into Government and Government
Intervention into the Market, 2 Colum. Sci. 8: Tech. L. Rev. 1, 11 30—46 (lune 8, 2001). at
http://www.stlr.org/cite.cgi?volume=28carticle=1 (on ﬁle with the Columbia Law Review)
(pointing out public goods aspects of Internet infrastructure); A. Michael Froomkin.
Wrong Turn in Cyberspace: Using ICANN to Route Around the APA and the Constitution,
50 Duke L._]. 17, 55 (2000) (observing that the National Science Foundation had “already
begttn funding cooperative private-sector Internet research and development in 1986 and
continued to do so on an increasingly large scale until 1995"); see also jonathan M.
Barnett, Cultivating the Genetic Commons: Imperfect Patent Protection and the Network
Model of Innovation. 37 San Diego L. Rev. 987. 1004 (2000) (“In the absence of some. form
of state intervention. the market is likely to underinvest in fundamental innovation
projects that generate a large stream of inappropriable spillovers").

35. See Michael L. Katz 8: Carl Shapiro, Systems Competition and Network Effects].
Econ. Persp., Spring 1994. at 93, 102—03 [hereinafter Katz 8: Shapiro, Systems
Competition] (noting that “an open communications network shares many features with a
public good; small users may free-ride on large users who may bear the costs necessary to
create and market the network“); see also Richard Comes 8: Todd Sandler, The Theory of
Externalities, Public Goods, and Club Goods 240—326 (2d ed. 1996) (describing the public
goods concept in general and the intersection of public goods and game theory); William
M. Landes 8c Richard A. Posner. An Economic Analysis of Copyright Law, 18]. Legal Stud.
325, 326 (1989) (explaining public goods concept in intellectual property context);
Pamela Samuelson et al., A Manifesto Concerning the Legal Protection of Computer
Programs, 94 Colttm. L. Rev. 2308, 2337 11.92 (1994) (same).

36. As Wendy Gordon explains. markets will remain underdeveloped where the costs
of initial investment are high, copying is easy. and the copyist can undercut the initial
inventor's price by free riding on the inventor‘s efforts. See Wendy]. Gordon. Asymmetric2003] INTELLECTUAL PROPERTY POLICY 547
forms (whether or not they are connected to the Internet) plays a critical
role in regulating innovation.

In addressing the question of how to encourage investment in public
goods, government faces a choice between funding such development di-
rectly—as it did with regard to the Intemet—or relying on private sector
development encouraged by intellectual property protection. Where gov-
ernment decides to provide for intellectual property protection to en-
courage invention, it must be careful to calibrate the investment incen-
tives awarded to developers so as to limit the ability of inventors to
prevent innovation by denying access to would-be improvers and rivals.37
Even though companies have long developed products on a proprie-
tary basis in the software industry, intellectual property law has yet to set-
tle on a coherent model of when to allow open access to an information
platform for purposes of developing a similar product. This access can
occur either because intellectual property law declines to protect user
interfaces or because it allows access to a platform standard through re-
verse engineering. As deﬁned by a leading case, reverse engineering can
be understood as the process of using a ﬁnished product and working
backward to determine how it was actually made.38 In the case of
software programs, reverse engineering is used to translate a program
written in object code (that is, the machine-readable language or binary
code of ones and zeros that tells the computer what functions to per-
form) to source code (which programmers can read and understand) .39
Market Failure and Prisoner’s Dilemma in Intellectual Property, 17 U. Dayton L. Rev. 853,
861—67 (1992).

37. For discussions of this basic purpose of intellectual property law, see Phillip
Areeda 8: Louis Kaplow, Antitrust. Analysis: Problems, Text, Cases 152—53 (5th ed. 1997);
Barnett, supra note 34, at 991 (summarizing “incentive theory” of intellectual property as
postulating that the purpose of intellectual property protection is to stimulate “private
investment by warding off low-cost imitators and promising monopolistic proﬁts that will at
least cover product development costs”); Landes 8c Posner, supra note 35, at 326 (“For
copyright law to promote economic efﬁciency, its principal legal doctrines must, at least
approximately, maximize the beneﬁts from creating additional works minus both the losses
from limiting access and the costs of administering copyright protection”); Robert P.
Merges 8c Richard R. Nelson, On the Complex Economics of Patent Scope, 90 Colum. L.
Rev. 839, 843 (1990) (expanding incentive theory to incorporate role for postinvention
improvement). Moreover, as commentators have recognized, intellectual property law's
focus on motivating original works must be tempered with an appreciation for other
purposes of information management, such as allowing for critical commentary and
promoting a robust marketplace of ideas. See, e.g., Robert P. Merges, Are You Making Fun
of Me?: Notes on Market Failure and the Parody Defense in Copyright, 21 AIPLA Q]. 305,
306 (1993) (critiquing narrow version of incentive theory).

38. Kewanee Oil Co. v. Bicron Corp., 416 US. 470, 476 (1974).

39. For a detailed discussion of the issue, see Andrewjohnson-Laird, Software Reverse
Engineering in the Real World, 19 U. Dayton L. Rev. 843 (1994); see also Jessica Litman,
Copyright and lnfonnation Policy, Law 8c Contemp. Probs., Spring 1992, at 185, 197—98
(explaining process of translating object code into source code); Pamela Samuelson 8:
Suzanne Scotchmer, The Law and Economics of Reverse Engineering, 111 Yale LJ. 1575,
1608—13 (2002) (same).548 COLUMBIA LAW REVIEW [VOL 103:534
In so doing, companies often will need to copy the protected software
program; nonetheless, where such “intermediate copying" serves the pur-
pose of facilitating interoperability between a platform and a complemen-
tary product, the courts have condoned such copying.40 In such cases,
noninfringing use does not mean free access, as the process of translating
object code to source code“ can be quite expensive and time
consuming.42
The legal status of reverse engineering shapes the nature of com peti-
tion and innovation in information platforms by providing a quasi-com-
pulsory license to a platform.43 By allowing access to a standard, intellec-
tual property law creates an incentive for the standard bearer to license
its product to rivals at an amount equal to the cost of reverse engineering
the platform standard and creating an independent invention.‘H In many
cases, the price for negotiated access may be above that amount, as the
40. Most recent cases endorse this right under the Copyright Act. See Sega Enters.
Ltd. v. Accolade. lnc., 977 F.2d 1510, 1527—28 (9th Cir. 1992) (concluding, as a matter of
law, that reverse engineering constituted fair use of a copyrighted work); Atari Games
Corp. v. Nintendo of Am., lnc., 975 F.2d 832, 844 (Fed. Cir. 1992) (satne). For a sampling
of the legal commentary endorsing such a right. see]. Beckwith Burr, Competition Policy
and Intellectual Property in the Information Age, 41 Vill. 1.. Rev. 193, 194—99 (1996);_|ulie
E. Cohen, Reverse Engineering and the Rise of Electronic Vigilantism: Intellectttal
Property Implications of “Lock-Out" Programs. 68 S. Cal. 1.. Rev. 1091, 1104—34 (1995).
Indeed, a number of recent statutory enactments speciﬁcally provide for such a right. See
Digital Millennium Copyright Act of 1998 (DMCA) § 12010), Pub. L. No. 105-304. § 103,
112 Stat. 2860, 2866—67 (1998) (codiﬁed as amended at 17 U.S.C. § 1201(1)) (allowing for
reverse engineering to achieve interoperability): Semiconductor Chip Protection Act of
1984 (SCPA) §905(a). Pub. 1.. No. 98—620. §§ 301—302. 98 Stat. 3335. 3350 (1984)
(codiﬁed as amended at 17 LF.S.C. §906(a)) (permitting reverse engineering for certain
purposes); Brooktree Corp. v. Advanced Micro Devices. lnc., 977 F.2d 1555. 1565—67 (Fed.
Cir. 1992) (discussing SCPA). The Copyright Act itself. however. provides merely for a fair
use defense, leaving courts to employ a set of factors to determine whether such a defense
should prevail on a case-by-case basis. 17 U.S.C. § 107'.

41. To be precise, there. are a number of different translation processes under the
broad category of reverse engineering. See Brian Fitzgerald et al., Innovation. Software,
and Reverse Engineering, 18 Santa Clara Computer 8: High Tech. L]. 121, 125—29 (2001)
(describing disassembly, decompilation, emulation. and binary translation methods of
reverse engineering). As all of these processes entail intermediate copying (albeit to
different degrees), the courts have tended not to distinguish them for purposes of the
relevant legal analysis. See, e.g., Sony Computer Enun't. Inc. v. Connectix Corp.. 203 F.3d
596. 603—04 (9th Cir. 2002) (refusing to distinguish between classic “disassembly” method
and “black box" reverse engineering. which requires making numerous copies).

42. See Samuelson et a1., supra note 35, at 2403—04.

43. See Joseph Farrell 8c Michael L. Katz. The Effects of Antitrust and Intellectual
Property Law on Compatibility and Innovation. 43 Antitrust Bull. 609, 611—13 (1998).

44. In suggesting that “fair use is nothing more than a zero-price compulsory license
of copyrighted works." others make this basic point. Timothy J. Brennan. ('Iopyright.
Property, and the Right to Deny, 68 Chi.-Kent L. Rev. 675, 712 (1993). At least in the
reverse engineering context, however. most do not account for the technical dilliculty of
gaining access to the protected work. But see Samuelson 8c Scotchmer, supra note 39. at
1589 (providing a more careful account of the relationship between reverse engineering
and licensing).2003] INTELLECTUAL PROPERTY POLICY 549
sponsor of the platform standard can often provide valuable speciﬁcation
information above and beyond access to the technical interface itself.45
In theory, once intellectual property law settles on clear legal rules, ﬁrms
will be better positioned to act in advance of litigation (or reverse engi-
neering) to agree on a reasonable license for access to the platform stan-
dard. Unfortunately, as Coase’s theorem and subsequent scholarship
make clear, transaction costs and imperfect information may well prevent
many such resolutions from taking place.46 Moreover, as reverse engi-
neering can be quite complicated, the legal permission to do so may be
insufﬁcient to enable ﬁrms to gain access to a platform standard. In such
cases, either antitrust action or telecommunications regulation may be
necessary to ensure such access.47
C. Intellectual Property Law and the Development of Platform Standards
Intellectual property law enjoys an important advantage over anti-
trust and regulation in deciding when to allow or prevent open access to
a platform standard because it operates only as a check on private con-
duct, not as an afﬁrmative regulatory regime that superintends access ob-
ligations. This advantage of intellectual property law stems from the
nonrivalrous nature of intellectual property (i.e., it can be used by many
at the same time), such that allowing open access to it does not present
any of the management problems associated with the “tragedy of the
commons” scenario.48 The risk in developing an intellectual property re-
45. For a discussion of this point, see Annabelle Gawer 8c Michael A. Cusumano,
Platform Leadership: How Intel, Microsoft, and Cisco Drive Industry Innovation 100-03
(2002).

46. See, e.g., R.I-1. Coase, The Problem of Social Cost, 3]. L. 8c Econ. l (1960); see
also A. Mitchell Polinsky, An Introduction to law and Economics 11-14 (2d ed. 1989)
(providing concise summary of the Coase theorem and the problem of transaction costs);
Michael L. Katz, Intellectual Property Rights and Antitrust Policy: Four Principles for a
Complex World, 1]. Telecomms. 8: High Tech. L. 325, 328—29 (2002) (explaining the
importance of the Coase theorem in grappling with complexities of intellectual property
and antitrust law).

47. A more complete exploration of the related antitrust and telecommunications
regulation issues is beyond the scope of this Article. For a discussion of the former, see
Mark A. Lemley, Antitrust and the Internet Standardization Problem, 28 Conn. L. Rev.
1041, 1042-43 (1996) [hereinafter Lemley, Internet Standardization]. For a look at the
latter, see Weiser, lntemet Governance, supra note 3, at 822—23. The effort to harmonize
intellectual property and antitrust policy continues to be an important subject for debate.
See generally Michael A. Carrier, Unraveling the Patent-Antitrust Paradox, 150 U. Pa. L.
Rev. 761 (2002); Weiser, Information Platforms, supra note 33.

48. See Niva Elkin-Koren, Copyrights in Cyberspace—Rights Without Laws?, 73 Chi.-
Kent L. Rev. 1155, 1190—92 (1998). This phenomenon of private property neither
managed by the government nor subject to control of a private entity represents a distinct
class of property supported by a long tradition. See Carol Rose, The Comedy of the
Commons: Custom, Commerce, and lnherently Public Property, 53 U. Chi. L. Rev. 711,
720 (1986) [hereinafter Rose, Comedy of the Commons]. Intellectual property law also
has important advantages over regulation because the public goods quality of information
technology standards enable them to be shared without the challenges presented by the550 COLUMBIA LAW REVIEW [VOL 103:534
gime that will withhold protection in certain instances is that this regime
may fail to provide an adequate incentive to develop any innovation at all.
Thus, the core challenge for developing an appropriate open access re-
gime for information platforms is to craft a framework that both respects
the need to provide incentives for investment and permits access when
necessary to facilitate competition and innovation.49 Given the signiﬁ-
cance of standards in the information technology sector,50 this issue mer-
its much more careful attention than it has received to date, particularly
in light of the uncertain status of reverse engineering, which acts as an
important regulator of access to information platforms.

In acknowledging a role for antitrust and telecommunications regu-
lation oversight (at least where reverse engineering efforts are ineffec-
tive), it is important to emphasize that the existing interplay among intel-
lectual property law, antitrust, and telecommunications regulation does
not advance a coherent competition policy. In particular, each regime
approaches the issue of open access to platform standards in its own way,
even when that approach is in tension with the policy goals advanced by
the other regimesf"I Although this Article does not detail the intersec-
tion of intellectual property and antitrust law (nor set forth how antitrust
law should work in tandem with telecommunications law“), it does rec-
ommend that the three regimes work in combination with one another—
and not at cross purposes, as currently is the case.

forced sharing of physical facilities. See AT&T Corp. v. Iowa Utils. Bd.. 525 US. 366.
428—31 (1999) (Breyer, J., concurring in part and dissenting in part) (discussing
challenges of managing shared physical facilities).

49. See Robert Cooter 8: Thomas Ulen, Law and Economics I35 (1988) ("[T]he
dilemma is that without a legal monopoly not enough information will be produced but
with the legal monopoly too little of the information will be used.").

50. Consider. for example, a I995 study that estimated that over ﬁfty percent of all
new standards—across all industries—were developed for the information technology
sector. See Steven Oksala et al., The Structure of IT Standardization, 4 StandardView 9, IO
(1996).

5I. A classic example is the case of antitrust oversight of conduct related to
intellectual property. A number of courts have held that the objectives imposed by
antitrust law differ for intellectual property and real property. See Weiser, Information
Platforms, supra note 33, at 16—18 (discussing intellectual property—antitrust intersection).

52. The integration of these areas of law within a broader framework is part of a
larger project. For several components of this effort, see Philip j. Weiser, Goldwasser, the
Telecom Act, and Reﬂections on Antitrust Remedies, 55 Admin. L. Rev. (forthcoming
2003) (on ﬁle with the Columbia Law Review); see also Weiser, Information Platforms, supra
note 33, at 3—8 (discussing relationship between these areas. along with First Amendment
law). See generally Philip]. Weiser, The Imperative of Harmonization Between Antitrust
and Regulation, in. Telecommunications Convergence: Implications for the Industry and
for the Practicing Lawyer 2002 (PLI Intellectual Property, Course Handbook Series No. C-
698, 2002) (advancing model for a convergence between antitrust and regulation);_]oseph
Farrell 8: Philip J. Weiser, Modularity, Vertical Integration, and Open Access Policies:
Towards a Convergence of Antitrust and Regulation in the Internet Age 5, at http:/,/
repositories.chib.org/iber/cpc/CPC02-035 (on file with the Columbia Law Rtvinu) (same).2003] INTELLECTUAL PROPERTY POLICY 55]
The current state of how these legal regimes work in tension with
one another can be illustrated effectively by the recent antitrust case
against Microsoft. In that case, the court analyzed a challenge to
Microsoft’s dominance in the operating systems market. Ultimately,
through antitrust law, the Department of Justice, a number of litigating
states, and Microsoft settled on a set of access remedies.53 Such access
opportunities, however, might also have been available through intellec-
tual property law to the extent that it did not limit opportunities for po-
tentially successful reverse engineering. In fact, intellectual property law
does not regulate reverse engineering in a consistent manner because
patent law tends to be quite restrictive of it and copyright law quite lib-
eral, even where the same computer software product is protectible
within both regimes.54 Understood properly, intellectual property law
can deﬁne the nature of a ﬁrm’s ownership rights in an information plat-
form (including permitting access where appropriate), and antitrust and
telecommunications regulation can further limit those rights where the
theoretical possibility of access (through reverse engineering) does not
occur in practice.55 In the Microsoft case, it may well have been the prac-
tical obstacles to reverse engineering the operating system that rein-
forced Microsoft’s dominance, but the lack of a more sensible intellectual
property regime did not help matters.56
Intellectual property law also enjoys an advantage over antitrust and
telecommunications regulation in regulating access to would-be domi-
nant information platforms because reverse engineering acts as a self-
help opportunity for ﬁrms that may otherwise be defeated in the market-
place before a conduct remedy (overseen either by a regulatory agency or
53. See United States v. Microsoft, 231 F. Supp. 2d 144, 202—03 (D.D.C. 2002). For a
discussion of the settlement agreement's restrictions, see Dan Carney, Microsoft Could Still
Lose a Lot of Yardage, Bus. Wk., Dec. 24, 2001, at 35, 35.

54. This inconsistency could be a virtue if the award of patents for software inventions
reﬂected truly superior originality as compared to that embodied in software inventions
protected by copyright. See Michael]. Schallop, Protecting User Interfaces: Not as Easy as
1-2-3, 45 Emory L._]. 1533, 1566-67 (1996) (suggesting that patent law and not copyright
law provide protection for truly innovative user interfaces); cf. Peter S. Menell, The
Challenges of Reforming Intellectual Property Protection for Computer Software, 94
Colum. L. Rev. 2644, 2647—48 8c n.19 (1994) (arguing for protection for software products,
including user interfaces, only where they require “signiﬁcant research efforts”). But the
broad issuance of software patents strongly suggest that the current regime does not work
this way in practice. See Robert P. Merges, As Many as Six Impossible Patents Before
Breakfast: Property Rights for Business Concepts and Patent System Reform, l4 Berkeley
Tech. L._]. 577, 589—91 (1999) (highlighting problem that many software patents are of
exceptionally poor quality).

55. For a development of this overall vision, see Weiser, Information Platforms. supra
note 33, at 16—17 .

56. For a suggestion along the lines of how intellectual property could address
Microsoft’s dominance, see jonathan Zittrain, The Un—Microsoft Un-Remedy: Law Can
Prevent the Problem that It Can't Patch Later, 31 Conn. L. Rev. 1361, 1372-74 (1999)
(suggesting that reduction in term of copyright protection could provide an important
check on Microsoft’s dominance).552 COLUMBIA LAW REVIEW [Vo|. 103:534
a court administering an antitrust remedy) can take effect. Consider. for
example, the case of RealNetworks, which produces an application that
enables Internet users to view digital content—either music or video—
using its RealPlayer. Just recently, RealNetworks announced that it had
reverse-engineered Microsoft’s rival Windows Media Player in order to
ensure that users could use the RealPlayer for any content developed for
the Media Player.57 This step can be understood either as an offensive
effort to appropriate the value of Microsoft’s system or as a defensive
measure to stay alive.58 By condoning defensive measures, intellectual
property law can protect ﬁrms that need access to a would—be dominant
standard without the delay inherent in an antitrust action. Conversely, by
refusing to provide access where two or more rival products are both sus-
tainable competitors, intellectual property law can provide important in-
centives for investment and experimentation between competing infor-
mation platforms.

ll. THE CURRENT STATE or INTELLECTUAL PROPERTY LAw’s TREATMENT
OF REVERSE ENGINEERING
A. The Legal Status of Reverse Engineering
This section ﬁrst sets out the legal background for how intellectual
property law regulates reverse engineering and then addresses how re-
verse engineering works in practice.

1. Legal Underpinnings. — Over the course of the Internet's early de-
velopment, Congress and the courts struggled to develop a stable legal
regime to regulate the proprietary development of computer software.
The two pillars of this regime were Congress's conclusion that computer
programs were eligible for copyright protection-‘39 and the Supreme
Court’s loosening of its prior restrictions on the patenting of software.60
57. jim Hu, Real Takes the Open-Source Route. CNET News.com, July 22, 2002, at
http://news.com.com/2100-1023-945406.html (on ﬁle with the Columbia Law Review)
[hereinafter Hu. Open-Source Route]. RealNetworks’s use of reverse engineering—and
its suggestion that it may be appropriate as a defensive effort against Microsoft's
dominance—is a double—edged sword in that its product also faces the possibility of rival
offerings created by reverse engineering its own program. See Paul Festa, Reverse
Engineering Could Threaten RealNetworks, Others. CNET News.com, Feb. 2, 2000, at
http://news.com.com/2100—1023-236427.html (on ﬁle with the Columbia Law Review).

58. Both RealNetworks's and analysts' evaluations of the initiative suggest that the
step reﬂects a defensive action against an otherwise likely dominance by Microsoft. See
Hu. Open-Source Route, supra note 57; Joe Wilcox, Digital Media: Will Microsoft Win
AgainP, CNET News.com,]uly 25. 2002. at http:/ / news.com.com/ 2100—1023-938997.html
(on ﬁle with the Columbia Law Review).

59. In 1980, Congress adopted the recommendation of the National Committee on
New Technologies Uses (CONTU), making clear that copyright law protected software
programs. See Pub. L. No. 96-517, § 10(a). 94 Stat. 3015, 3028 (1980) (amending
copyright law and deﬁning “computer program" as "a set of statements or instructions to
be used directly or indirectly in a computer in order to bring about a certain result“).

60. In 1981, the Supreme Court modiﬁed its prior skepticism toward software patents.
ruling that the implementation of a mathematical formula in a programmed digital2003] INT ELIECTUAL PROPERTY POLICY 553
In the wake of these two seminal events, courts and commentators have
debated the optimal competition policy strategy for regulating the devel-
opment of software,61 without reaching a stable consensus. Most notably,
patent law, copyright law, and the Digital Millennium Copyright Act's
(DMCA) anticircumvention provisions62 all treat reverse engineering dif-
ferently.” Because these regimes sometimes regulate the same software,
they need to move toward a coherent treatment of reverse engineering,
lest they work at cross purposes from one another.

The inconsistent treatment of reverse engineering by different areas
of intellectual property law may well reﬂect the fact that there is no re-
verse engineering doctrine as such. Under current judicial precedent,
for example, patent and copyright law call for different approaches, even
though both regimes govern the same technologies in some cases. None-
theless, both for ease of exposition and because this Article advocates a
coherent treatment of reverse engineering across intellectual property
law, this Article will refer generally to intellectual property law’s treat-
ment of reverse engineering (as opposed to differentiating between pat-
ent and copyright law).

computer qualiﬁed for patent protection. Diamond v. Diehr, 450 U.S. 175, 192—93 (1981)
(limiting Gottschalk v. Benson, 409 U.S. 63 (1972)). The Federal Circuit later loosened
this test even further, concluding in In re Alappal that the standard for whether an
algorithm merits protection is based on whether it is a “disembodied mathematical
concept . . . which in essence represents nothing more than a ‘law of nature,‘ ‘natural
phenomenon,‘ or 'abstract idea.” 33 F.3d 1526, 1544 (Fed. Cir. 1994) (departing from
early implementation of Diehr standard that required that an algorithm also apply to
speciﬁc physical element or processes); see also State St. Bank 8: Trust Co. v. Signature Fin.
Group, Inc., 149 F.3d 1368, 1375 (Fed. Cir. 1998) (making clear that “business method
patents” as embodied in software are patentable). In the wake of a number of influential
decisions that weakened the scope of copyright law vis-a-vis reverse engineers, software
ﬁrms began increasingly to seek patents as a stronger form of protection for their
intellectual property. See Philip]. McCabe 8c William A. Tanenbaum, Copyright Decisions
Increase the Value of Patent Protection for Computer Software, j. Proprietary Rts., Feb.
1993, at 2, 4.

61. See Dennis S. Karjala, The Relative Roles of Patent and Copyright in the
Protection of Computer Programs, 17 J. Marshall _]. Computer 8c Info. L. 41, 42 (1998)
(noting rethinking of legal doctrine in light of these decisions). To be sure, trade secret
protection and the advent of licensing of intellectual property law also have contributed to
the legal landscape. See infra notes 69—70. By contrast, despite some suggestions,
trademark law—speciﬁcally its doctrine governing the protection of “trade dress"—has
never been used to regulate access to user interfaces. See Lauren Fisher Kellner,
Comment, Trade Dress Protection for Computer User Interface “Look and Feel," 61 U.
Chi. L. Rev. 1011, 1035 (1994) (arguing that protecting user interfaces’ "look and feel”
under trademark law would prevent customer confusion); Lisa T. Oratz, User Interfaces:
Copyright vs. Trade Dress Protection, Computer Iaw.,]an. 1996, at 1, 7—8 (explaining why
suggestion does little to improve legal landscape).

62. See 17 U.S.C. §§ 1201—1204 (2000).

63. See Lemley 8c McGowan, supra note 12, at 524-25 8: n.195 (observing that patent
law does not condone reverse engineering); see also Vivian Lou Chen, Sony Sues Bleem
for Infringing Six PlayStation Game Patents, Bloomberg News, May 18, 2000, LEXIS,
Bloomberg, All Bloomberg News File (on ﬁle with the Columbia Law Review) (reporting on
Sony's patent law suit after its copyright action failed on reverse engineering grounds).554 COLUMBIA LAW REVIEW [V0]. 1032534
Despite the arguments made by a number of prominent commenta-
tors for a sui generis regime to regulate the software industry,64 Congress
has declined to take up any such suggestion. This is not surprising, as
Congress generally has allowed the judiciary to craft judge-made doc-
trines to ensure that intellectual property rules ﬁt market realities and
enhance social welfare.65 As a result, “the heart of copyright doctrine—
what may be protected and with what limitations and exceptions—has
been developed by the courts through experience with individual
cases.”66 Occasionally, Congress steps in to harmonize particular areas of
intellectual property law, but such efforts tend to occur when an industry
consensus emerges as to how to rationalize that area of the law.67
Given the reality of the judicially centered development of intellec-
tual property policy,68 an important question regarding intellectual prop-
erty policy for the computer industry is how judges can tailor the current
system of copyright and patent protection (as well as trade secret69
and contractual protections”) to promote sound competition poli-
64. See _|.H. Reichman, Legal Hybrids Between the Patent and Copyright Paradigms,
94 Colum. L. Rev. 2432, 2444—45 (1994) (praising such a model).

65. See Maureen A. O'Rourke, Evaluating Mistakes in Intellectual Property Law:
Conﬁguring the System to Account for lmperfection. 4j. Small 8: Emerging Bus. L. 167.
170 (2000).

66. Lotus Dev. Corp. v. Borland lnt'l, lnc., 49 F.3d 807. 820 (lst Cir. 1995) (Boudin.
j.. concurring). aﬂ’d by an equally divided Court, 516 U.S. 233 (1996). The Federal
Circuit's decision outlining the relevant protection for software patents reflect a similar
perspective. See AT&T Corp. v. Excel Communications, lnc., 172 F.3d 1352, 1356 (Fed.
Cir. 1999) (praising ability of patent law "to adapt to new and innovative concepts. while
remaining true to basic principles”).

67. See Dennis S. Karjala. Copyright Protection of Operating Software. Copyright
Misuse, and Antitrust, 9 Cornelle. 8: Pub. Pol’y 161, 180—81 (1999); Litman, supra note
39, at 196 ("Congress, as it typically does in its crafting of copyright legislation, referred the
matter to off-the-record negotiations among interested private parties to develop an
alternative that all of them could support." (footnote omitted)). The enactment of the
SCPA represents one such notable effort. See 17 U.S.C. § 906(a); see also Leo]. Raskind 8c
Richard H. Stern, Introduction to Symposium: The Semiconductor Chip Protection Act of
1984 and Its Lessons. 70 Minn. 1.. Rev. 263, 263—64 (1985) (describing Act, which stemmed
from desire of U.S. manufacturers for a “more orderly mode of competition").

68. Because the legislative process often is inﬂuenced by industry demands, some
argue that the judicial development of copyright policy produces better results. See, e.g..
jessica Litman, Digital Copyright 51—63, 67-68 n.22, 68 n.28 (2001) (detailing impact on
copyright law of endemic shortcomings of legislative process).

69. To be sure. trade secret protections can be important in certain cases, but, by
definition, this regime cannot provide any protection against reverse engineering. See
Kewanee Oil Co. v. Bicron Corp.. 416 U.S. 470, 490 (1974). Thus, it is generally irrelevant
to the intellectual property issues discussed herein.

70. The major issue with respect to contract law is the enforceability of licensing terms
that arguably conﬂict with the purposes of intellectual property laws, including the
encouragement of reverse engineering when appropriate. Compare Bowers v. Baystate
Technologies. lnc., Nos. 01-] 108, 01-1109. 2003 WL 262300 *3-*6 (Fed. Cir.jan. 29. 2003)
(enforcing license term that precludes reverse engineering). with id. at *13—*16 (Dyk.j..
concurring in part and dissenting in part) (criticizing holding). Fora very good discussion2003] INTELLECTUAL PROPERTY POLICY 555
cy.71 By leaving the task of tailoring intellectual property rules to courts,
Congress anticipates that federal judges who confront such issues will act
quite similarly to common law courts that have had to reﬁne property
rules over time to confront new realities.72 In the case of intellectual
property, both patent and copyright law provide statutory frameworks to
guide the analysis,” but they leave many important issues—like when re-
verse engineering should be permitted to facilitate access to information
platforms—open to interstitial gap ﬁlling by the courts.“
Intellectual property law includes two limiting doctrines that regu-
late what aspects of would-be protected software belong in an “informa-
tion commons” by allowing open access to inventions under certain con-
of the issue, see Maureen A. O'Rourke, Drawing the Boundary Between Copyright and
Contract: Copyright Preemption of Software License Terms, 45 Duke LJ. 479 (1995).

71. See julie E. Cohen 8: Mark A. Lemley, Patent Scope and Innovation in the
Software Industry, 89 Cal. L. Rev. 1, 3 (2001) (“With roughly eighty thousand software
patents already issued, and the Federal Circuit endorsing patentability without
qualiﬁcation, [questions about other possible regimes for intellectual property protection]
are for the history books”); Karjala, supra note 67, at 182 (“[Albsent a major crisis of a
type that is difficult to imagine, Congress is institutionally incapable of correcting a
legislative error in recognizing intellectual property protection that is too long, too strong,
or too broad”).

72. See H.R. Rep. No. 94-1476, at 65—66 (1976), reprinted in 1976 U.S.C.C.A.N. 5659,
5678—80 (discussing conception of fair use doctrine as delegation to courts to develop the
contours of the principle); see also Carol M. Rose, Energy and Efﬁciency in the
Realignment of Common-Law Water Rights, 19 j. Legal Stud. 261, 267—94 (1990)
(discussing evolution of water rights property schemes). Given the dynamic nature of the
lntemet, some have argued that this model promotes more ﬂexible and effective rules.
See Suzanna Sherry, Haste Makes Waste: Congress and the Common Law in Cyberspace,
55 Vand. L. Rev. 309, 312 (2002) (arguing that the nature of common law adjudication,
which allows for constant reevaluation. provides a vehicle superior to legislation in
regulating fast-changing technologies).

73. The Copyright Act requires that the work be original—in particular, containing a
modicum of creativity—and be ﬁxed in a tangible medium of expression. See 17 U.S.C.
§ 102(a) (2000). With respect to patenting, the Patent Act requires that a claimed
invention be useful, novel (in relation to any prior art), nonobvious (with respect to prior
art), and a “process, machine, manufacture, or composition of matter.” See 35 U.S.C.
§ 101 (2000). For a discussion of these requirements as applied to computer software, see
Lawrence D. Graham 8: Richard O. Zerbe, jr., Economically Efﬁcient Treatment of
Computer Software: Reverse Engineering, Protection. and Disclosure, 22 Rutgers
Computer 8: Tech. L._]. 61, 92—115 (1996). Given the different. but overlapping, missions
of copyright and patent, there is no bar on obtaining both forms of protection for a
particular invention (provided. of course, that it meets the requisite criteria). See Mazer v.
Stein, 347 U.S. 201, 217 (1954); see also Atari Games Corp. v. Nintendo of Am., lnc., Nos.
C 88-4805 FMS, C 89-0027 FMS, 1993 WL 214886, at *1—*22 (N.D. Cal. Apr. 15, 1993)
(analyzing both patent and copyright infringement claims).

74. This feature of intellectual property protection for the computer age has
frustrated both courts and commentators. See Lotus Dev. Corp. v. Borland lnt'l, lnc., 49
F.3d 807, 820 (151 Cir. 1995) (Boudin, j., concurring) (“Applying copyright law to
computer programs is like assembling a jigsaw puzzle whose pieces do not quite ﬁt"); Paul
Goldstein, lnfringement of Copyright in Computer Programs, 47 U. Pitt. L. Rev. 1119,
1126—30 (1986) (noting that copyright and patent protection do not provide an optimal
regime for the software industry).556 COLUMBIA LAW REVIEW [Vol. 1032534
ditions. In particular, the fair use doctrine—as embodied in copyright
law—and the misuse doctrine—as embodied in patent law, but more re-
cently in copyright as well75—provide for judicial discretion in when to
condone access to information platform standards.76 In each case, the
doctrine emerged from a judicially created principle that Congress later
codiﬁed.77 The fair use doctrine enjoys a long and successful pedigree,
beginning with a case decided by Justice Story involving biographies of
George Washington,78 whereas the misuse doctrine emerged more
recently.79
The fair use doctrine’s policy-based defense against infringement
rests on what the Supreme Court has called an “equitable rule of reason"
analysis.M0 Given its ﬂexible nature, the fair use doctrine continues to
evolve, moving from an initial focus on noncommercial actorsBl to one
that allows commercial actors to use protected works in ways that are
“transformative.”"‘2 Although the fair use defense is rooted in copyright,
some commentators have suggested that patent law should also embrace
75. See, e.g.. Lasercomb Am., Inc. v. Reynolds. 911 F.2d 970, 973 (4th Cir. 1990)
(recognizing misuse defense in copyright law).

76. To be more precise, the fair use and misuse doctrines provide the primary
defenses for the use of what would otherwise constitute protectible software under
copyright law‘s abstraction-ﬁltration-comparison analysis. This test, which stems from
Judge Learned Hand's opinion in Nichols 1!. Universal Pictures Carp, ﬁrst determines the
appropriate level of abstraction at which a work should be protected, ﬁlters out any other
unprotectible elements, and then compares the original work to the alleged infringing
work. 45 F.2d 119, 121 (2d Cir. 1930); see also Gates Rubber Co. v. Bando Chem. lndus..
Ltd., 9 F.3d 823, 834—36 (10th Cir. 1993) (applying test to computer software); Computer
Assocs. lnt'l, Inc. v. Altai, lnc., 982 F.2d 693. 706—12 (2d Cir. 1992) (same); Mark A.
Lemley, Convergence in the Law of Software (JopyrightP, 10 High Tech. L.J. 1, 13—14
( 1995) (describing test and judicial acceptance of it). Other doctrines—such as the
implied license concept—also serve this purpose, albeit primarily for patent, as the fair use
doctrine serves this purpose for copyright. See Harper 8: Row, Publishers, Inc. v. Nation
Enters. 471 U.S. 539. 549 (1985) (describing fair use as providing implied license)
(quoting H. Ball. Law of Copyright and Literary Property 260 (1944)). As to the implied
license for patents, this doctrine can best be understood as akin to a prescriptive easement.
See Jesse Dukeminier 8: James E. Krier. Property 811 (5th ed. 2002) (describing
prescriptive easement concept). Among other things, this doctrine provides that ﬁrms that
fail to disclose patented technologies during a standard-setting process cannot later assert
intellectual property rights to a component of the adopted standard. Cf. Wang Labs., Inc.
v. Mitsubishi Elecs. Am., lnc., 103 F.3d 1571. 1580—82 (Fed. Cir. 1997) (setting forth legal
standard for and finding presence of implied license where patent holder “tried to coax
[defendant] into [its] market" and “provided designs, suggestions, and samples" to
defendant).

77. See 17 U.S.C. § 107 (codifying factors to determine fair use); 35 U.S.C. § 271 (d)
(codifying exclusions from misuse doctrine).

78. See Folsom v. Marsh, 9 F. Gas. 342 (C.C.D. Mass. 1841).

79. See Morton Salt Co. v. 0.5. Suppiger Co., 314 U.S. 488, 491 (1942).

80. Sony Corp. of Am. v. Universal City Studios, Inc.. 464 U.S. 417, 448 (1984).

81. See, e.g., id. at 451 (deeming “presumptively . . . unfair" “every commercial use of
copyrighted material“).

82. (Iampbell v. AculllRose Music, lnc., 510 U.S. 569. 579—85 (1994); cf. Lotus Dev.
Corp. v. Borland lnt'l, lnc., 49 F.3d 807, 820 (1st Cir. 1995) (Boudin, J., concurring)2003] INTELLECTUAL PROPERTY POLICY 557
this principle.” Conversely, the misuse doctrine, which took root in pat-
ent law, is increasingly employed in the copyright context as well.84 Like
the fair use doctrine, it also is somewhat open-ended, with the focus be-
ing on whether a patent is used for anticompetitive purposes.85
The malleability of the fair use and misuse doctrines stems from both
their open-ended nature and the lack of a clearly developed theoretical
framework for them—even after decades of judicial and academic de-
bate. To that end, commentators have offered a number of alternative
conceptions to guide these doctrines. As to the fair use principle, many
courts and commentators have suggested that an economics-based ap-
proach should guide the analysis.86 This approach, along with the four
(noting that Borland's commercial appeal lay not in its copying of Lotus's menu, but in its
added features).

83. See generally Maureen A. O'Rourke, Toward a Doctrine of Fair Use in Patent
Law, 100 Colum. L. Rev. 1177 (2000).

84. The Supreme Court has explicitly provided for a misuse defense in patent law, see
Manon Salt, 314 U.S. at 491, but has merely suggested (and not held) that one exists in the
copyright context. See United States v. Loew’s, Inc., 371 U.S. 38, 45—46 (1962). Lower
courts, however, have gone ahead to evaluate copyright misuse claims. See, e.g.,
Lasercomb Am., Inc. v. Reynolds, 91] F.2d 970, 973—77 (4th Cir. 1990).

85. See, e.g., B. Braun Med., Inc. v. Abbott Labs., 124 F.3d 1419, 1426 (Fed. Cir. 1997)
(“[B]y imposing the condition, the patentee has ‘impermissibly broadened the “physical or
temporal scope” of the patent grant with anticompetitive effect.” (quoting Windsurﬁng
Int'l, Inc. v. AMF, Inc., 782 F.2d 995, 1001—02 (Fed. Cir. 1986) (quoting Blonder-Tongue
Labs., Inc. v. Univ. of III. Found., 402 U.S. 313, 343 (1971))); Mallinckrodt, Inc. v.
Medipart, Inc., 976 F.2d 700, 704 (Fed Cir. 1992) (inquiring into whether restriction
“arose to restrain practices that did not in themselves violate any law, but that drew
anticompetitive strength from the patent right, and thus were deemed to be contrary to
public policy"). Thus, the crucial—and potentially limiting—factor is how broadly to
construe the relevant protection conferred by patent or copyright. This issue remains
unsettled, with some courts allowing for reverse engineering (at least in the copyright
misuse context) even where it involved actual copying of the protected work itself. See
Alcatel USA, Inc. v. DGI Techs., Inc., 166 F.3d 772, 791 (5th Cir. 1999); DSC
Communications Corp. v. DGI Techs., Inc., 81 F.3d 597, 600 (5th Cir. 1996). Admittedly,
these precedents from the copyright context are not necessarily applicable to the patent
context, as the provision of the Patent Act relating to misuse may call for a different
analysis in cases where the nonpatented invention only works with other patented goods.
35 U.S.C. § 271 (d) (2000); see Cohen 8: Lemley, supra note 71, at 36 n.146.

86. For a classic articulation of this view, see Harper 8: Row, Publishers, Inc. v. Nation
Enters, 471 U.S. 539, 566—67, 566 n.9 (1985); Wendy j. Gordon, Fair Use as Market
Failure: A Structural and Economic Analysis of the Betamax Case and Its Predecessors, 82
Colum. L. Rev. 1600, 1618 (1982) (arguing that fair use applies when (I) a market failure
is present, (2) the allowance of the use is socially desirable, and (3) award of fair use would
not cause substantial injury to the incentives of the copyright holder); see also Wendy j.
Gordon, Market Failure and Intellectual Property: A Response to Professor Lunney, 82
B.U. L. Rev. 1031, 1035 (2002) (explaining that Gordon’s approach did not mean to
elevate transaction costs as the paramount consideration, but rather embraced as market
failures all of the “ways in which real world market systems can fail to align private and
social economic welfare"). Even within the traditional commitment to an economics-based
approach, there is a variety of formulations of fair use, all of which can claim consistency
with current judicial doctrine in some shape or form. Compare Princeton Univ. Press v.
Mich. Documents Servs., Inc., 99 F.3d 1381, 1387 n.6, 1388 (6th Cir. 1996) (en banc), cert.558 COLUMBIA LAW REVIEW [Vol. 103:534
statutorily prescribed considerations,”7 has provided some structure to
the analysis, but as discussed in Part V, has failed to provide a settled or
sound analytical structure for when to allow reverse engineering.

The misuse principle, which is of more recent vintage than fair use,
continues to evolve. This doctrine initially arose from patent law’s public
policies (which include, for example, the tradition of only providing pro-
tection for a limited term) and its unwillingness to afford a remedy to a
party with “unclean hands."88 At present, there is a split of authority as to
whether the misuse doctrine provides an open-ended defense for ﬁrms to
allege that a patent holder has violated public policy or whether this doc-
trine merely tracks existing antitrust law standards.89 In recent years,
Congress has acted to limit misuse in the patent context,90 so there are
denied, 520 U.S. 1 156 (1997) (focusing on possibility of licensing in ruling that fair use did
not authorize. copying of certain course materials), and Tom W. Bell, Escape from
Copyright: Market Success vs. Statutory Failure in the Protection of Expressive Works, 69
U. Cin. L. Rev. 741, 804 (2001) (suggesting that, in light of the possibilities for contracting
and technological self-help mechanisms (such as those afforded by digital rights
management), copyright law and fair use are no longer necessary to address market
failures), with Robert P. Merges, The End of Friction? Property and Contract in the
"Newtonian" World of On-Line Commerce, 12 Berkeley Tech. L.j. H5, 133—35 (1997)
(noting the tendency of a market failure justification to limit fair use and suggesting that
fair use can be justified on redistributive grounds), and Merges, supra note 37, at 312
(suggesting a market-centered account that explains why fair use is necessary to enable that
parody works are produced). Of course, this debate does not even take account of the
argument that copyright should not be justiﬁed in economic terms. See Neil Weinstock
Netanel. Copyright and a Democratic Civil Society, 106 Yale L]. 283, 332—35 (1996).

87. In particular, the statute calls for a four-part inquiry into:
(1) the purpose and character of the use. including whether such use is of a
commercial nature or is for nonproﬁt educational purposes; (2) the nature of the
copyrighted work; (3) the amount and substantiality of the portion used in
relation to the copyrighted work as a whole: and (4) the effect of the use upon
the potential market for or value of the copyrighted work.

17 U.S.C. § 107 (2000).

88. See Morton Salt, 314 U.S. at 490—91 (holding that courts should not enforce patent
rights used to suppress competition).

89. Compare Saturday Evening Post Co. v. Rumbleseat Press, lnc., 816 F.2d 1191,
1200 (7th Cir. 1987) (concluding that copyright misuse is best analyzed under antitrust
standards), USM Corp. v. SPS Techs., lnc., 694 F.2d 505, 512 (7th Cir. 1982) (maintaining
that patent misuse is best analyzed using antitrust standards), and james A.D. White,
Misuse or Fair Use: That ls the Software Copyright Question, 12 Berkeley Tech. L1]. 251,
275 n.99 ( 1997) (collecting commentary), with Lasmtomb, 911 F.2d at 978 (framing issue as
"whether the copyright is being used in a manner violative of the public policy embodied
in the grant of a copyright"), Brett Frischmann 8: Dan Moylan, The Evolving Common Law
Doctrine of Copyright Misuse: A Uniﬁed Theory and Its Application to Software, 15
Berkeley Tech. LJ. 865, 871, 926 (2000) (proposing “narrow public policy-based per se
rules [to] supplement a core antitrust-based [misuse] defense" and arguing that antitrust
“does not necessarily promote copyright policy"), and White, supra, at 275—77 (raising
questions about ﬁtness of an antitrust standard for copyright misuse in the software
industry).

90. After the patent misuse doctrine expanded through judicial development.
Congress passed the Patent Misuse Reform Act in 1988 to prevent patent holders from
losing patent protection until the misused conduct ceased and its effects were purged. 352003] INTELLECTUAL PROPERTY POLICY 559
unanswered questions about the role for and scope of this doctrine.“
Nonetheless, like patent law's development of a number of limiting doc-
trines to cabin the scope of patents that can threaten innovation,92 it is
both advisable and quite possible that courts will use the misuse principle
to govern reverse engineering of patented software in a sensible fashion
that is harmonious with the fair use doctrine’s treatment of the issue.”
Ultimately, to address the confusion resulting from a number of uncer-
tain and overlapping rules emerging from the copyright and patent law
contexts,94 the Supreme Court or Congress may well need to resolve this
issueﬁ’5 Ideally, this resolution would provide not only a harmonious con-
U.S.C. § 271(d) (enumerating cases in which patent owners “shall not be denied relief or
deemed guilty of misuse or illegal extension of the patent right," including derivation of
revenue, licensing to others, seeking to enforce, refusing to license for use, and
conditioning licensing or sale on acquisition of other licenses or rights); see 134 Cong.
Rec. 24, 3247—73 (1988) (statement of Sen. Leahy); see also Marshall Leaffer, Engineering
Competitive Policy and Copyright Misuse, 19 U. Dayton L. Rev. 1087, 1101 (1994) (noting
criticisms that prompted revision). According to some commentators, this law led courts
to construe the doctrine—even as left intact—quite narrowly. See Katherine E. White, A
Rule for Determining When Patent Misuse Should Be Applied, ll Fordham Intell. Prop.
Media 8:: Ent. L._]. 671, 709 (2001).

91. See Leaﬂer, supra note 90, at 1101 (suggesting that, in the wake of statutory
revision, patent misuse doctrine is “of questionable viability").

92. For an excellent overview of this issue, see Merges 8: Nelson, supra note 37, at
844—68.

93. Professor Merges suggests that an independent role for intellectual property law
here can complement the competitive protections developed by antitrust law. See Robert
P. Merges, Reﬂections on Current Legislation Affecting Patent Misuse, 70 j. Pat. 8c
Trademark Off. Soc'y 793, 800 (1988) (suggesting that doctrine reasonably expands
beyond antitrust because some “thin” markets for patented technology would not meet
antitrust definition of a market); see also Areeda 8c Kaplow, supra note 37, at 163
(characterizing existing law as “grounded in the competitive considerations of antitrust
analysis"). In the event that the misuse principle does not facilitate such a convergence,
Cohen and Lemley have argued that, with respect to patent law, the experimental use
exception and the implied license doctrine could serve a similar purpose. See Cohen 8c
Lemley, supra note 71, at 29—32.

94. See Mark A. Haynes, Commentary: Black Holes of Innovation in the Software
Arts, 14 Berkeley Tech. L._]. 567, 570 (1999) (noting unreliability of fair use protection for
reverse engineers);jonathan Band 8: Noah Levine, You Say Misuse, I Say Fair Use . . .,
Computer Law., Nov. 1996, at 10, 10 (noting that leading decisions began by identifying
the right principle and then found a legal doctrine tojustify the result); Robert P. Merges,
Who Owns the Charles River Bridge? Intellectual Property and Competition in the
Software Industry 7 (Univ. of Cal. Berkeley Sch. of Law, Public Law and Legal Theory,
Working Paper No. 15, 1999), available at http://papersssrn.com/solS/delivery.cfm/
000223651.pdf?abstract_id=208089 (on ﬁle with the Columbia Law Review) (remarking that
it is “far too early to tell whether the nascent pro-interoperability trend will endure, and if
so, what its ﬁnal contours will be”).

95. For an effort by Congress to step in and provide clarity, see 17 U.S.C. §906(a)
(2000) (enumerating exceptions to exclusive rights of owner of a mask work). For a case
where the Court stepped in to clarify an overlapping interplay between different regimes,
see TrafFix Devices, Inc. v. Mktg. Displays, Inc., 532 US 23, 29—30 (2001) (holding trade
dress protection could not apply where ﬁrm previously held a patent on the would-be
protected product—“strong evidence that the features therein claimed are functional”—560 COLUMBIA LAW REWEW [Vol. 103:534
ceptualization of the fair use and misuse approaches to reverse engineer-
ing, but also an explanation of how those approaches cohered with anti-
trust policy.

2. Reverse Engineering in Practice. — In terms of the substantive de-
bates on the proper legal treatment of reverse engineering, most com-
mentators fall into either the “commons” or the “proprietary control”
camps, either condoning access all of the time or not at all.96 Signiﬁ-
cantly, many thoughtful commentators have failed to distinguish between
cases involving horizontal access (between rival platforms) and vertical
access (between a platform and a complementary product) —let alone to
acknowledge the complex economic considerations related to the com-
petitive costs of allowing reverse engineering at all.97 Even in their very
careful discussion of the issue, Professors Samuelson and Scotchmer de-
clined to evaluate separately the horizontal and vertical access scena-
and could not “carry the heavy burden of showing that the feature is not functional”); see
also Bonito Boats, Inc. v. Thunder Craft Boats, Inc., 489 U.S. 141, 157 (1989) (overriding
Florida statute protecting boat hull designs not protected by patent). But see Vessel Hull
Protection Act §§ 1301—1302, Pub. L. No. 105—304. §§ 501—502, 112 Stat. 2860. 2905—16
(1998) (codiﬁed at 17 U.S.C. §§ 1301—1302) (enacting plug mold statute); Douglas G.
Lichtman, The Economics of Innovation: Protecting Unpatenrable Goods. 8] Minn. L.
Rev. 693, 730 (1997) (criticizing Bonito decision on the ground that it failed to
acknowledge salutary aspects of the Florida law).

96. For an argument that access should be allowed in all contexts, see, for example.
Brief Amicus Curiae of American Committee for Interoperable Systems in Support of
Appellees, ProCD. Inc. v. Zeidenberg, 86 F.3d 1447 (7th Cir. 1996) (No. 96-1139), available
at http:/ / www.1aw.berkeley.edu/ institutes/ bclt/ pubs/ lemley/ procdbrief.html (on ﬁle
with the Columbia Law Review) (arguing that “the freedom to reverse engineer software in
order to achieve interoperability is critical” to preserving competition in software industry);
Greg Weiner, Reverse Engineering as a Method of Achieving Compatibility in the
Computer Industry. 6 U. Balt. lntell. Prop. L._]. 1, 6—7 (1997) (arguing that the lack of a
reverse engineering right stiﬂes innovation). For a criticism of any such right, see Arthur
R. Miller, Copyright Protection for Computer Programs, Databases, and Computer-
Generated Works: Is Anything New Since CONTUP, 106 Harv. L. Rev. 977, 1020 (1993)
(calling a right that ignores platform owners‘ interests “singularly ill-suited to vindicating
the public interest"). A notable exception to this all or nothing approach can be found in
O‘Rourke, supra note 83, at 1211—35 (arguing for more nuanced approach); see also
Anthony]. Mahajan, Note, Intellectual Property, Contracts, and Reverse Engineering After
ProCD: A Proposed Compromise for Computer Software, 67 Fordham L. Rev. 3297,
3331-35 (1999) (proposing a two-phase protection of source code, the first of which would
permit restrictions on reverse engineering). Professors Samuelson and Scotchmer also
appreciate the complex nature of the issue, but they ultimately examine only whether or
not to endorse a categorical version of the reverse engineering doctrine—as opposed to
some limited such right. See Samuelson & Scotchmer, supra note 39, at 1626—30.

97. See, e.g.. Cohen 8: Lemley, supra note 71, at 3 (arguing for reverse engineering
right to facilitate reuse of software invention without making horizontal-vertical access
distinction); Daniel _]. Gifford 8: David McGowan, A Microsoft Dialog, 44 Antitrust Bull.,
Fall 1999, at 619, 677 (promoting interoperability without evaluating horizontal—vertical
access distinction). But see Samuelson 8c Scotchmer, supra note 39, at 1608 (“The
economic case for allowing reverse engineering to achieve interoperability is not as open
and shut as some legal commentators have suggested").2003] INTELLECTUAL PROPERTY POLICY 561
riosgS—or even the possibility of condoning reverse engineering only
when a platform owner achieved dominance.99
To appreciate the different dynamics involved in facilitating horizon-
tal access as opposed to vertical access, consider the case of instant mes-
saging systems.100 In the case of vertical access, the arrangement would
be between an applications provider—say, a ﬁrm that uses instant messag-
ing technology to remind users of important business meetings—and the
platform owner—say, AOL, which provides the instant messaging system.
In the horizontal case, the relevant access right would be between a rival
information platform—say, Microsoft—and AOL. In the vertical situa-
tion, the offering of an interoperable application will generally be unob-
jectionable because, as a complementary good, it will add to the value of
the network.101 Not surprisingly, AOL (like other information platform
owners) acts quite favorably toward companies who provide complemen-
tary applications for their instant messaging system, providing them with
royalty-free access to their system, while it resists cooperation with rivals
like Microsoft.102 Consequently, the potential cost of providing access to
a developer of a complementary application is considerably less, and the
rationale for allowing reverse engineering (as a reasonable default rule)
is quite strong.103
98. In advocating a sui generis regime for protecting computer software, however,
Professor Samuelson did, albeit in a footnote, make this distinction. See Samuelson et al.,
supra note 35, at 2404 n.394.

99. See Samuelson 8c Scotchmer, supra note 39, at 1608 (concluding that
“interoperability has, on balance, more beneﬁcial than harmful economic consequences”).

100. The possibility of intellectual property litigation between rival information
platforms in this market is not merely a hypothetical, as AOL recently secured a patent on
its instant messaging system. See jim I-Iu, Patent Creates 1M Wrinkle, CNET News.com,
Dec. 17, 2002, at http:/ / news.com.com/ 2100-1023-978234.html (on ﬁle with the Columbia
Law Review).

101. See Katz 8c Shapiro, Systems Competition, supra note 35, at 103—04 (discussing
need for platform providers to attract developers of complementary products). Similarly,
reverse engineering that produces, say, user manuals and ﬁxes any bugs in the information
platform also adds value to the original product and thus is presumptively a noninfringing
use. See Fitzgerald et al., supra note 41, at 122—23 (discussing such uses of reverse
engineering).

102. See The Future of the Interactive Television Services Marketplace: What Should
Consumers Expect?: Hearing Before the Subcomm. on Telecommunications, Trade, and
Consumer Protection, House Comm. on Commerce, 106th Cong. 40—41 (2000)
(statement of Steve Case, Chairman and CEO, America Online, Inc.) (explaining that
royalty-free licensing for [M application developers is “not just something we did with a few
companies. We have done this with many companies and are eager to do with more
companies”); see also Douglas Lichtman, Property Righs in Emerging Platfonn
Technologies, 29]. Legal Stud. 615, 616 (2000) (reporting that Palm and Handspring have
adopted similar strategies of facilitating third party developer access to their interfaces).

103. There is still an argument against allowing reverse engineering to achieve
vertical compatibility in emerging platform technologies, as explained in Lichtman, supra
note 102, at 616—19. The argument against allowing unlimited reverse engineering for
vertical access centers on the point that the platform owner can ensure more value
through control than openness and—at the very least—should have the legal means to562 COLUMBIA lAW REVIEW [V0]. 103:534
To date, the video game industry has provided the context for many
of the recent cases focused on access to an information platform via re-
verse engineering. Most of these cases have involved vertical access issues
where a manufacturer of a game wants to copy the protected standard as
part of a reverse engineering process to ensure that its games will work on
the system.”’“ In those cases, courts have regularly held as a noninfring—
ing use any copying of the standard that enables companies to create
products that make the information platform more valuable and do not
compete with existing games. ”’5 A second set of cases involves horizontal
access issues where an entrant wants to ensure that its system is compati-
ble with an established one—such as in cases where a new system is de-
signed so that it can play games made for a competitor’s system.“"" In
horizontal access cases, the competitive effects of the copying are quite
different from the vertical access cases, but courts and commentators
have yet to translate the competition policy principles that govern such
scenarios into legal doctrine.

For a sense of how the different theoretical frameworks of the com-
mons and proprietary control models can inﬂuence intellectual property
law, consider the recent case of Sony Computer Entertainment, Inc. v. Connec-
tix Corp“)7 In that case, Connectix used reverse engineering, including
some intermediate copying of Sony's PlayStation video game console’s
BIOS (basic input-output system), to develop a new software program
called the Virtual Game Station (VGS)."”‘ The VGS, which cost Connec-
tix approximately $150 thousand to develop,”9 enables consumers to
play games made for Sony’s game console on a personal computer. By
contrast, Sony spent well in excess of $600 million developing the PlaySta-
tion and building up brand loyalty for it, which it highlighted in challeng-
make this choice. This Article. does not consider whether reverse engineering rights
should be limited in such cases, but rather conﬁnes its analysis to why reverse engineering
rights should be more limited in the horizontal scenario. In terms of a relevant
consideration for the vertical access issue. Michael L. Katz's reminder about the Cease
theorem—that where the default rule is set is often where it stays—underscores why the
current rule in favor of vertical access is a plausibly correct one. See Katz, supra note 46. at
328 (“In a sense. transactions costs create stickiness—where a market begins affects where
it ends up."); see also Ty, Inc. v. Publ'ns Int'I I.td., 292 F.3d 512. 517 (7th Cir. 2002)
(Posner, J.) (explaining default rule allowing access for complementary products as one
that “economizes on transaction costs”).

104. See, e.g., Sega Enters. Ltd. v. Accolade, Inc.. 977 F.2d 1510, 1514—15 (9111 Cir.
1992) (upholding as fair use reverse engineering of game console to ensure compatibility
of videogames).

105. See, e.g., id. at 1523 (addressing vertical access through reverse engineering that
“led to an increase in the number of independently designed video game programs offered
with the Genesis console").

106. See. e.g., Sony Computer Entm't. Inc. v. Connectix Corp.. 203 F.3d 596, 599 (9th
Cir. 2000) (addressing horizontal access through reverse engineering that led to creation
of an emulator that played Sony PlayStation games on a computer).

107. Id. at 602—08.

108. See id. at 598—99.

109. Id. at 601.2003] INTELLECTUAL PROPERTY POLICY 563
ing the legality of Connectix’s rival invention.”0 The Ninth Circuit, how-
ever, endorsed openness as a categorical value and held that, because
Connectix’s invention was “modestly transformative” of Sony’s platform,
its use of reverse engineering should be deemed a noninfringing use.1“
Thus, in this case, the commons model won out over the proprietary con-
trol model, a debate that Part III examines at length.

To make the law governing computer software even more complex,
Congress and state legislatures have provided additional protection to in-
ventors that may allow them to use contracts and “digital rights manage-
ment” (DRM) systems”'-’ to limit the use of reverse engineering, thereby
changing the balance struck by judicially crafted copyright and patent
doctrines.”3 In particular, the proposed Uniform Computer Informa-
tion Transactions Act (UCITA)114 and the anticircumvention provisions
of the DMCA“5 both may enable inventors to limit reverse engineering
opportunities. In cases that implicate limits on reverse engineering
through contract and DRM, the courts may well protect at least certain
reverse engineering opportunities by holding that intellectual property
law preempts license restrictions on reverse engineering and construing
the DMCA’s protection of reverse engineering broadly (or holding any
limits on reverse engineering unconstitutional).”6
The use and legal protection of DRM systems in general and the
DMCA’s anticircumvention provisions in particular may complicate con-
siderably the legal status of reverse engineering. On its face, the DMCA
110. Sony Computer Entm't, Inc. v. Connectix Corp., 48 F. Supp. 2d 1212, I214 (N.D.
Cal. 1999) (noting Sony's investment).
111. Connectix, 203 F.3d at 606—07.

112. DRM systems, whether through use of encryption, watermarking, or other
technological means, serve as a virtual lock to restrict access to and uses of digital content.
For a discussion of digital rights management technologies and their effectiveness, see
David Balaban, Note, The Battle of the Music Industry: The Distribution of Audio and
Video Works via the Internet, Music and More, 12 Fordham lntell. Prop. Media 8c Ent. LJ.
235, 259—62 (2001).

113. Some commentators have criticized such efforts as overbroad and threatening to
the balance provided by intellectual property law's protection of fair use. See, e.g.,_]ulie E.
Cohen, Lochner in Cyberspace: The New Economic Orthodoxy of “Rights Management,”
97 Mich. L. Rev 462, 480-515 (1998).

114. Uniform Computer Information Transactions Act §815 (2001), available at
http://www.law.upenn.edu/bll/ulc/ucita200.pdf (on file with the Columbia Law Review).

115. 17 U.S.C. §§ 1201—1204 (2000).

116. See Samuelson 8c Scotchmer, supra note 39, at 1626—30 (discussing UClTA); id.
at 1630-49 (discussing DMCA's relationship to reverse engineering and possibility of
judicial invalidation). The legal debate over shrinkwrap licenses preceded the UClTA, as
earlier court cases differed on the legality of such licenses. Compare ProCD, Inc. v.
Zeidenberg, 86 F.3d 1447, 1449 (7th Cir. 1996) (enforcing a shrinkwrap license), with
Vault Corp. v. Quaid Software Ltd., 847 F.2d 255, 268—69 (5th Cir. 1988) (holding
restriction on reverse engineering preempted under the Copyright Act), and Mark A.
Lemley, Intellectual Property and Shrinkwrap Licenses, 68 S. Cal. L. Rev. 1239, 1248—53
(1995) (arguing such licenses are unenforceable). See also supra note 70 (discussing
issue).564 COLUMBIA [AW REVIEW [Vol. 103:534
purports not to limit the access that companies can obtain through re-
verse engineering to facilitate interoperability,”7 and leaves it to the
courts to deﬁne the appropriate scope of permissible reverse engineering
efforts.‘ ‘5 The complications arise, nonetheless, because companies may
be able to use encryption technology in an “arms race" to make it more
difﬁcult for rivals to gain access to their protected standard or pursue
litigation under the DMCA to combat legitimate reverse engineering.l '9
At this point, however, it is unclear whether DRM systems based on en-
cryption, watermarking, or other technologies will be effective in prevent-
ing (or even substantially raising the costs of) reverse engineering, as well
as what impact the DMCA will have on efforts to reverse engineer stan—
dards that should not be protected under intellectual property law.“-'"
B. Putting the Reverse Engineering Debate in Context
Before using the competitive platforms model to develop an appro-
priate conception of how intellectual property law should treat reverse
engineering, it is important to explain that this model leaves untouched
three important facets of current law (as developed under the fair use
principle). First, vertical access—which involves products that are com-
plementary to an information platform—should not be restricted. Sec-
ond, cases involving the ability to transfer user-created applications (such
as word processing files, for example) from one system to another also
should not be restricted. Finally, because the relevant intellectual prop-
erty issue in reverse engineering cases will often be the legality of the
copying of the protected standard in the ﬁrst place (as opposed to the
117. 17 U.S.C. § 1201(l).

118. See id. § 1201(l)(l) (protecting reverse engineering only “to the extent any such
acts of identiﬁcation and analysis do not constitute infringement under this title“).

119. As the Rtimerdes case demonstrates, the line. between legitimate and illegitimate
reverse engineering may not always be easy to draw. See Universal City Studios \'.
Reimerdes, 111 F. Supp. 2d 294, 319—20 (S.D.N.Y. 2000) (rejecting defense that “DeCss”
code did not violate the DMCA because it was designed to achieve interoperability with
computers running the Linux operating system). 21de sub nom Universal City Studios. Inc.
v. Corley. 273 F.3d 429 (2d Cir. 2001).

120. Some predict that "new technologies may soon make copying virtually impossible
without the permission of the copyright owner." Marshall Leaffer, The Uncertain Future of
Fair Use in a Global Information Marketplace, 62 Ohio St. L._]. 849, 859 (2001). but others
are far less certain of the ultimate outcome. See. e.g., Bruce Abramson. Promoting
Innovation in the Software Industry: A First Principles Approach to Intellectual Property
Reform, 8 B.U._]. Sci. 8c Tech. L. 75, 130 (2002) (concluding that it is "unclear" whether
advances in encxyption will outstrip advances in reverse engineering technology).
Depending on how the use of encryption technology evolves, Congress may ultimately
need to revisit the DMCA to prevent wasteful “arms races"—where each side invests in
encryption and decryption technology—and encourage legal means—as opposed to self-
help efforts—to resolve these access questions as well as to provide clearer protection for
legitimate reverse engineers. Alternatively, to the extent that the use of DRM technologies
prevents reverse engineers from gaining relatively manageable access to would—be
protected standards. this will increase the pressure on antitrust and regulation to address
such access questions.2003] IN'IELLECTUAL PROPERTY POLICY 565
rival product itself), courts will face challenging remedial questions re-
garding the propriety of injunctive relief. This section will address each
point in turn.

First, with respect to the difference between horizontal and vertical
access, intellectual property law currently appreciates the difference be-
tween complementary and substitutable goods, and thus generally allows
access for the creation of complementary goods.‘2‘ On this rationale, for
example, the fair use principle authorizes reporters to quote from pri-
mary sources without ﬁrst having to seek permission. By contrast, intel-
lectual property law generally does not allow a competitor to appropriate
a creator’s achievement without paying any fee as a license to use the
proprietary standard.122
Second, the importance of protecting information platform innova-
tions should not extend to enabling a ﬁrm to beneﬁt from investments
made by users of the product (as opposed to by the producer). This dis-
tinction between user investments and producer investments is the differ-
ence between the value of a set of word processing documents created by
the user and an innovative user interface, invented by the producer, that
makes the product easier to use. Microsoft, for example, initially devel-
oped a spreadsheet program (Excel) that could read macros created by
users for Lotus 1-2-3, and a word processing program (Word) that could
read documents originally produced on WordPerfect. Signiﬁcantly,
Microsoft’s product—unlike some others—did not copy Lotus’s user in-
terface, but was compatible with Lotus’s product in that it would give
users the ability to use the Lotus commands, would read its ﬁles, and
could use its macros.‘23 To avoid protecting investments such as a user’s
creation of her own ﬁles and macros, intellectual property law should
distinguish between two forms of open access: access to a user interface
or the product’s essential standard—cloning—that may be objectionable
from a competition policy standpoint, and access to the program speciﬁ-
cations that will allow users to rely on converters or adapters that enable
their creations to be transferred to other systems—compatibility—that
will generally be unobjectionable.I24
121. For a cogent explanation of this principle, see Ty, Inc. v. Publ’ns Int'l Ltd., 292
F.3d 512, 517—18 (7th Cir. 2002).

122. To be more precise, the reverse engineering right may place an upper bound on
the amount of the potential license: A would-be licensee will not pay more than it would
cost to reverse engineer the product to gain the sought-after access. See Cohen 8: Lemley,
supra note 71, at 18; Samuelson 8c Scotchmer, supra note 39, at 1589. In reality, there may
well be other beneﬁts that the inventor can provide in addition to access to the standard
(forms of technical assistance, for example), so the cost of reverse engineering may often
be a ﬂoor, not a ceiling, for a licensing fee. See Gawer 8c Cusumano, supra note 45, at
100—03.

123. See Stan J. Liebowitz 8: Stephen E. Margolis, Winners, Losers, and Microsoft:
Competition and Antitrust in High Technology 140 (1999).

124. See Eng'g Dynamics, Inc. v. Structural Software, Inc., 26 F.3d 1335, 1343—44 (5th
Cir. 1994) (making the clone-compatibility distinction). Because there is no clear and
consistent technology in this area, there is plenty of opportunity for confusion. See566 COLUMBIA LAW REVIEW [Vol. 103:534
Where the value of the overall standard is not intrinsic to that inven-
tion, but instead relates only to the user's investment in it—say, the crea-
tion of word processing documents—allowing access to product speciﬁca-
tions that will support a different product (as opposed to a clone built on
the same user interface and functionalities) may be, asjoseph Farrell put
it, “the only commercially reasonable way to compete.”125 Thus, intellec-
tual property law should condone reverse engineering used to gain access
to the product speciﬁcations (for compatibility purposes), but be more
careful in evaluating when a rival is permitted to appropriate a proprie-
tary standard or user interface (cloning). In so doing, intellectual prop-
erty law can both protect investment incentives and allow for a smoothly
functioning market where user investments will not necessarily determine
the success of a system just because it came first.

In many cases, the difference between access to the basic platform
standard itself and facilitating compatibility with it will be the difference
between a user interface and a product interface. User interfaces or plat-
form standards deﬁne how the software and the user interact;I26 product
interfaces enable programmers to design software so that it can work with
other software.127 Whether a rival reverse engineers a platform standard
or simply copies the basic user interface, this appropriation goes to the
essence of the invention at issue. Thus, where alternative user interfaces
or platform standards can be viable competitors and where their develop-
ment requires real innovation, courts should protect rival user interfaces
or standards.‘28 In many cases, a private ﬁrm may itself allow fairly liberal
Kenneth W. Dam. Some Economic Considerations in the Intellectual Property Protection
of Software, ‘24 ]. Legal Stud. 321, 330 (1995).

125. joseph Farrell. Arguments for Weaker Intellectual Property Protection in
Network Industries, in Standards Policy for Information Infrastructure 368, 373 (Brian
Kahin 8: Janet Abbate eds., 1995); see also Joseph Farrell 8c Garth Saloner, Converters,
Compatibility, and the Control of Interfaces, 15_|. Indus. Econ. 9, 13—14 (1992) (noting
that dominant ﬁrms might well refuse to provide key interface information necessary to
build a converter to interconnect with the industry standard).

126. Stated in more depth, user interfaces consist of the overall screen display, the
individual elements of the screen display (including the menu structure and the graphical
images used in the program), and the accompanying sounds that create much of the.
program's experience for users. See Apple Computer. Inc. v. Microsoft Corp., 35 F.3d
1435, 1438 8: nn.3—4 (9th Cir. 1994).

127. Such interfaces, for example, enable macros developed for Lotus 1-2-3 to work
with Microsoft's Excel spreadsheet program.

128. Some argue that user interfaces are merely “obvious” or “arbitrary" and thus not
worthy of protection. Compare Peter S. Menell, An Analysis of the Scope of Copyright
Protection for Application Programs, 41 Stan. L. Rev. 1045, 1099—1100 (1989) (arguing
that selection of a user interface is essentially arbitrary), with David Friedman, Standards as
Intellectual Property: An Economic Approach, 19 U. Dayton L. Rev. 1109, 1122 (1994)
(arguing that when standards involve signiﬁcant development costs, the “availability and
quality of the standard" and the “incentive to produce it" may depend greatly on the
reward offered by intellectual property protection). Given the value of innovative
interfaces, the better argument would seem to be that such inventions generally should be
rewarded through intellectual property protection—at least until and unless a single2003] INTELZECTUAL PROPERTY POLICY 567
terms of access to its information p1atform,‘29 but intellectual property
law should allow ﬁrms themselves to decide whether or not to adopt open
architecture strategies, provided that the ﬁrms do not control a dominant
standard.130
The core concern of the competitive platforms model is to resolve
the unsettled issue of how intellectual property law should regulate rival
systems.”1 To allow reverse engineering in all cases would threaten to
allow ﬁrms to “clone” inventions at a fragment of the cost to the original
producer (even though they would have to write an independent pro-
gram), thereby undermining important investment incentives.“2 At the
same time, refusing ever to permit reverse engineering to facilitate hori-
zontal access between competitive products would allow the original in-
ventor to appropriate a windfall on an initial invention that became dom-
inant while impeding the introduction of similar, and even superior,
goods into the market.

Finally, it is important to recognize that cases involving reverse engi-
neering raise a potentially tricky remedial question. In many reverse en-
gineering cases, the rival product itself—say, the Connectix VGS—does
not infringe on the original product’s intellectual property by using the
latter’s protected technology. Rather, the process of reverse engineering
(including the use of intermediate copying) that led to the manufacture
of the similar product constitutes the relevant infringement. From the
standard emerges as dominant. See Farrell 8c Katz, supra note 43, at 648-49; see also Eng'g
Dynamics, 26 F.3d at 1844 (“[1]f a best-selling program’s interface were not copyrightable,
competitors would be free to emulate the popular interface exactly. . . . This cannot be the
law."); infra Part V.B (discussing Lotus case).

129. See Joseph Farrell 8: Nancy Gallini, Second-Sourcing as a Commitment:
Monopoly Incentives to Attract Competition, 103 Q. j. Econ. 673, 675 8c n.4 (1988);
Andrea Shepard, Licensing to Enhance Demand for New Technologies, 18 RAND J. Econ.
360, 360—61 (1987) (discussing incentives for ﬁrms to license proprietary technology);
Farrell 8c Weiser, supra note 52, at 5—10.

130. See Farrell 8c Weiser, supra note 52, at 17—39 (explaining why platform providers
generally can be trusted to make such decisions).

13]. See Eng’g Dynamics, 26 F.3d at 1341 (stating that judicial doctrine is, “generously
described, in a state of creative ferment"); Samuelson 8c Scotchmer, supra note 39, at 1578
(noting set of challenges that leave doctrine in ﬂux). The lack of a settled, coherent
strategy for U.S. law is in contrast with an explicit regime adopted by the European Union.
See Jaap H. Spoor, Copyright Protection and Reverse Engineering of Software:
Implementation and Effects of the EC Directive, 19 U. Dayton L. Rev. 1063, 1063—64
(1994) (noting that “[u]nlike the U.S. Copyright Act, the EC Software Directive . . .
explicitly addresses the issue of software reverse engineering, thereby obligating EC
member countries to do the same in respect to their national copyright laws”).
Recognizing the complex competitive dynamics posed by reverse engineering, Professor
Samuelson and her Manifesto coauthors proposed an alternative sui generis regime that
would strike an appropriate balance between permitting and excluding access via reverse
engineering. Samuelson et al., supra note 35, at 2392.

132. See supra notes 106—1 10 and accompanying text (discussing disparity between
Sony’s initial investment in its game system and the cost to its rival to copy Sony’s
platform); see also Samuelson 8c Scotchmer, supra note 39, at 1585—90 (discussing cloning
issue).568 COLUMBIA LAW REVIEW [V0]. 103:534
standpoint of the competitive platforms model, the remedial ﬂexibility
that a court might have—in, say, imposing a compulsory license or dam-
ages as opposed to enjoining production or use—suggests that, in close
cases, the court might use this ﬂexibility to minimize the error costs of
either preventing reverse engineering where it is justiﬁed or allowing ac-
cess where it is unnecessary.‘33
III. THE CURRENT BATTLE IN INTELLECTUAL PROPERTY THEORY:
THE COMMONS MODEL VERSUS PROPRIETARY CONTROL
Intellectual property protection constitutes a ﬁrst line of competition
policy that provides open access to information platforms. By making
access more difﬁcult, intellectual property law can, like antitrust, discour-
age cooperation where competition would lead to more innovation and
consumer choice. Altematively, by allowing access (as in the Connectix
case‘S“), intellectual property law affords companies a self-help remedy
that facilitates open access without the regulatory intervention character—
ized by antitrust or telecommunications regulation.135 How intellectual
property law should function in this regard continues to spark heated
debates between advocates of the commons and proprietary control mod-
els, each of which pushes for very different approaches. In particular,
commons advocates point to the spectacular growth of the Internet based
on open source technologies, claiming that this growth could never have
occurred against a backdrop of proprietary standards. By contrast, the
proprietary control model underscores that a dominant ﬁrm may be able
to develop a uniform and continually evolving platform standard that can
push the industry forward. This Part evaluates these claims, highlighting
the shortcomings of each.

A. The Commons Model and Its Critics
With the privatization of the lntemet’s basic infrastructure and the
government’s decision not to direct the Intemet’s development, the In-
ternet’s future direction remains in flux. A number of legal commenta-
tors—most notably Lawrence Lessig—are associated with the vision that
the Internet should function as a “commons," relying on open source
technology for the maintenance and development of the Internet’s archi-
tecture.”‘6 At bottom, Lessig’s support for this model rests on both his
suspicion of proprietary standards developed by commercial ﬁrms and
133. See infra notes 318—320 and accompanying text.

134. Sony Computer Entm't, Inc. v. Connectix Corp., 203 F.3d 596 (9th Cir. 2000);
see supra notes 108—111 and accompanying text (discussing Connectix).

135. Because intellectual property law cannot facilitate access in all cases in which it
would be beneﬁcial. it cannot substitute for antitrust policy. See supra note 47 and
accompanying text.

136. See Lessig. Code, supra note 1, at 104—08; Lessig, Future of Ideas, supra note I,
at 55—72.2003] INTELLECTUAL PROPERTY POLICY 569
his belief that open source software leaves the end user in control.“7 In
Lessig’s words, an lntemet built on open source technologies will remain
a “commons” that is open to innovation from all comers and will adhere
to an open architecture model.”8 This section first sets out this model
and then critically evaluates its premises.

1. The Commons Model. — In the current struggle over how the In-
ternet will develop, the commons camp is often associated with the “cyber
hacker rallying cry” that “information wants to be free."'-"9 In the In-
ternet world, the information infrastructure has been mostly free, as
many of the main software programs that support Internet content are
nonproprietary and distributed on an open source basis. Under the
open source model, no individual ﬁrm beneﬁts directly from the creation
of the product, as all open source licenses allow for free access to the
source code for the software program. This model harkens back to the
early era of software development, where developers viewed software not
as a commercial product but as one that should be shared with society.
Under this model, the sharing and cloning of software—like the free re-
use of academic ideas—are viewed as natural and healthy.”° Most fa-
mously, the GNU-Linux operating system (which uses the GPL license
developed by Richard Stallman'“) has capitalized on the popularity of
open source development among independent programmers and contin-
ues to grow in popularity for use on lntemet servers.‘42
Under open source development, programmers collaborate on the
creation of software programs and allow all users free access to the pro-
137. See David G. Post, What Larry Doesn’t Get: Code, Law, and Liberty in
Cyberspace, 52 Stan. L. Rev. 1439, 1450—51 (2000) (discussing Lessig's concern that
commercialism of the lntemet and use of proprietary code will lead to less freedom in
cyberspace).

138. See Lessig, Future of Ideas, supra note 1, at 61 (stating that open source code
ensures a neutral platform that cannot be turned against innovators); Lawrence Lessig,
Architecting Innovation, 49 Drake L. Rev. 397, 403 (2001) (arguing that “the platform of
an open source system remains neutral" and “invites innovation”).

139. For a discussion of this “hacker movement" see Marci A. Hamilton, The TRIPS
Agreement: lmperialistic, Outdated, and Overprotective. 29 Vand. j. Transnat'l L. 613,
625 n.30 (1996); Michael Stutz, Freed Software Winning Support, Making Waves, Wired
News, Jan. 30, 1998, at http://www.wired.com/news/technology/O,1282,9966,00.html (on
ﬁle with the Columbia Law Retina) (stating that “hacker ethic" envisions that “information
should be shared, so that everyone can beneﬁt from it”).

140. See Dam, supra note 124. at 328, 330 (noting acceptance of software cloning in
hacker culture and that hackers view software “much like academics view library books-—
something to be acquired, studied in detail, and then borrowed from”).

141. See supra note 26 and accompanying text.

142. This operating system, which is often popularly described as Linux, actually
results from the merger of the GNU operating system project with the Linux kernel—a
program that allocates resources to the other programs running on the computer.
Accordingly, this Article shall refer to the operating system as “GNU-Linux." See Richard
Stallman, Linux and the GNU Project. at http:/ /www.fsf.org/ gnu/ linux-and-gnu.htm1 (last
updated Dec. 14, 2002) (on ﬁle with the Columbia Law Review).570 COLUMBIA LAW REVIEW [V0]. 103:534
grams’ source codes."‘3 Within the realm of open source development,
the GPL license reﬂects a particular vision of “free software,” as it insists
not only on openness, but prevents developers from using free software
in conjunction with proprietary products.‘44 By contrast, software merely
placed in the public domain enables any ﬁrm to repackage it—even with
modest improvements—and sell it as proprietary software.

The commons model’s fervent commitment to openness reﬂects the
perspective that, at least in the information industries, proprietary con-
trol is not necessary or desirable to encourage innovation. This perspec-
tive ﬁnds support in a substantial body of literature that makes clear that
a large number of all innovations would take place in the absence of any
intellectual property protection.‘45 lndeed, then-Professor Breyer high-
lighted this point over thirty years ago, well before the wave of added
intellectual property protection in recent legislation and judicial deci-
sions.”6 For advocates of the commons model, the legacy of the In-
ternet’s development provides even further reason for questioning the
centrality of broad intellectual property protection as a means of spurring
valuable innovation. In fact, this history underscores that intellectual
property protection raises the costs of invention to would-be
innovators. ”7
143. The basic deﬁnition for open source is set out in Bruce Perens, The Open
Source Deﬁnition, in Open Sources: Voices from the Open Source Revolution 171, I76 —
80 (Chris DiBona et al. eds., l999).

144. For a fuller explanation of free software, see supra note 26. For a discussion of
the economics of open source development. see Yochai Benkler, Coase's Penguin, or.
Linux and The Nature of [he Finn, ll2 Yale L._]. 369 (2002).

145. See jay B. Barney, Competence Explanations of Economic Proﬁts in Strategic
Management. in Dynamic Competition and Public Policy: Technology, lnnovation. and
Antitrust Issues 45. 57 Gerry Ellig ed., 2001) (citing studies that suggest that patenting
accounts for only fourteen percent of all inventions and that it is the least signiﬁcant factor
in Spurting innovation): Edwin Mansﬁeld et al., Imitation Costs and Patents: An Empirical
Study, 91 Econ. _]. 907, 9l3 (l981) (“Within 4 yea1s of their introduction, 60% of the
patented successful innovations in our sample were imitated. "); id. at 915 (“Excluding
drug innovations, the lack ol patent protection would have affected less than one-fourth of
the patented innovations in our sample. ): Roberto Mazzoleni 8: Richard R. Nelson, The
Beneﬁts and Costs of Strong Patent Protection: A Contribution to the Current Debate, 27
Res. Pol'y 273, 274 (1998) (citing relevant studies and explaining that “in most industries
patents were not an important part of the incentives ﬁrms have for investing in R&D”). To
be sure, this point is a general rule and there are exceptions within particular industries.
See, e.g., Richard C. Levin el al., Appropriating the Returns from Industrial Research and
Development. in 3 Brookings Papers on Economic Activity 783, 796 (Martin Neil Baily 8c
Clifford Winston eds., 1987) (arguing that only in drug industry do patents provide
particularly effective protection against appropriation); Mazzoleni 8c Nelson, supra, at 276
(noting that the "collection of small and medium sized ﬁrms in the American
biotechnology industry represents such an exception").

146. Stephen Breyer. The Uneasy Case for Copyright: A Study of Copyright in Books,
Photocopies. and Computer Programs, 84 Harv. l.. Rev. 28], 334-46 (1970).

I47. See Landes 8c Posner, supra note 35. at 332 (arguing that in some cases copyright
protection raises cost and thus decreases amount of creative expression); Levin et al., supra2003] INTELLECTUAL PROPERTY POLICY 57]
In the Internet world, the commons model looks to the increasing
use of open source licenses as well as standard-setting committees to regu—
late the development of new technologies. In particular, some argue that
these institutions allow for a “bottom-up” system of norms and traditions
that should replace current legal tools, such as intellectual property
laws.148 just recently, the World Wide Web Consortium (W3C), a group
that endorses standards for the Web, took a commons model approach,
concluding that patented technologies would not be permitted in that
group’s ofﬁcial standards.'49 To the extent that the W3C is able to de-
velop new standards without recognizing proprietary ownership—and li-
censing fees—for Internet technologies, it will offer a model of how the
commons approach can govern an Internet where proprietary ownership
is neither necessary nor desirable.150
The commons model rests in part on the “path dependence" theory
that network markets will almost invariably rely on a single standard. On
this view, an information technology standard may become dominant not
because of its relative merits and greater degree of technological sophisti-
cation, but because it came ﬁrst.151 Among economists, there is an ongo-
ing debate over which (if any) markets reﬂect this phenomenon, with the
case study of the standard for keyboards—the choice of the “QWERTY”
over the “Dvorak” model—being a topic of notable disagreement.152
note 145, at 816 (“Stronger appropriability will not yield more innovation in all contexts
and, where it does, innovation may come at excessive cost”).

148. See Elkin-Koren, supra note 48, at 1158—79 (detailing a potential shift to “private
ordering" regimes in cyberspace).

149. The debate over this issue is well documented at the World Wide Web
Consortium's Patent Policy Working Group homepage. In its document setting forth a
new proposal that would allow patented technologies to be included in its approved
standards, the W3C’s Patent Policy Working Group suggested that rejecting any role for
patents—and proprietary control—may be a lost cause; it stressed both that the “open
standards environment” was crucial to the Web's success and that “patents will be a factor
in the ongoing development of the World Wide Web infrastructure." Patent Policy
Working Group, World Wide Web Consortium, W3C Patent Policy Framework: W3C
Working Draft, Aug. 16, 2001, at http://www.w3.org/TR/2001/WD-patent-policy—
20010816/ (on ﬁle with the Columbia Law Review) [hereinafter Patent Policy Working
Group, Working Draft].

150. See Carol M. Rose, The Several Futures of Property: Of Cyberspace and Folk
Tales, Emission Trades and Ecosystems, 83 Minn. L. Rev. 129, 146—53 (1998)
(summarizing debate related to how the Internet will shape intellectual property law).

151. See W. Brian Arthur, Positive Feedbacks in the Economy, Sci. Am., Feb. 1990, at
92, 92.

152. Compare Carl Shapiro 8c Hal R. Varian, Information Rules: A Strategic Guide to
the Network Economy 185—86 (1999) [hereinafter Shapiro 8c Varian, Information Rules]
(arguing that the persistence of the QWERTY keyboard reﬂects path dependence), with
Liebowitz 8c Margolis, supra note 123, at 19—39 (challenging this interpretation), and SJ.
Liebowitz 8c Stephen E. Margolis, The Fable of the Keys. 33 ].L. 8: Econ. 1, 21—23 (1990)
(same). Other candidates for this theory include Microsoft's operating system. See
Stanley M. Besen 8c joseph Farrell, Choosing How to Compete: Strategies and Tactics in
Standardization, ]. Econ. Persp., Spring 1994, at 117, 118 (suggesting that inferior
products, such as MS—DOS, can triumph in a standards battle, in part because of572 COLUMBIA LAW REVIEW [Vol. 103:534
Those invoking this example to demonstrate the path dependence phe-
nomenon suggest that the Dvorak standard provided users with the ability
to type more quickly, but lost out to the established QWERTY standard
because QWERTY came ﬁrst. On this view, QWERTY, which initially
served the purpose of slowing down typists so that they would not jam the
keys, beneﬁted greatly from the fact that users continued to be locked
into an inferior standard.153 Following the logic of this argument, path
dependence theory claims that markets characterized by strong “network
effects”—that is, where “the utility a user derives from consumption of
the good increases with the number of other agents consuming the
good”'-”4—are also ones where one standard or product will achieve dom-
inance because its established value network will, once dominant, never
be replaced.

In network markets where a single standard emerges as dominant,
economists suggest that the market has “tipped" to a particular prod-
uct.'-"-" This tipping phenomenon does not suggest that the product is
inherently superior, but merely that a sufﬁcient mass of users have
adopted it and are locked into it because the switching costs of moving to
an incompatible product are sufﬁciently great to deter a move. '56 In par-
ticular, where a company can build a proprietary value network and pre-
vent others from gaining the critical mass to provide an alternative prod-
uct—say, by refusing to make its dominant product compatible with
rivals—it can establish a durable monopoly.

For intellectual property policy, the commons model suggests that
the Internet and information industries function best when they are open
and not susceptible to control by a proprietary ﬁrm. As commons model
advocates explain it, the Internet’s openness enables ﬁrms to introduce
innovations without worrying about gaining access to the basic platform.
Consequently, this model envisions that, by introducing proprietary stan-
dards to the Internet and allowing firms to exercise control over its devel-
opment, the Internet will not only fail to realize its potential, but may fail
as an emerging communications medium. On this view, reverse engi-
expectations as to the ultimate size of their network); see also joseph Farrell 8c Garth
Saloner, Installed Base and Compatibility: Innovation. Product Preannouncements, and
Predation, 76 Am. Econ. Rev. 940, 940 (1986) (describing how network effects create
resistance towards switching to new products).

153. See Joseph Farrell, Standardization and lntellectual Property, 30.]urimetricsj.
35, 37—38 (1989).

154. Michael L. Katz & Carl Shapiro, Network Externalities, Competition, and
Compatibility, 75 Am. Econ. Rev. 424, 424 (1985). The network effect of increased value
from additional users can be understood as having a direct component—that more
individuals who are connected to, say, an instant messaging system, can be reached via that
medium—as well as an indirect one—that, for example, more software applications will be
developed for a system as more individuals join it.

155. See Gregory]. Werden, Network Effects and Conditions of Entry: Lessons from
the Microsoft Case, 69 Antitrust L._]. 87, 90—91 (2001) (explaining tipping effect).

156. See Shapiro 8.- Varian, Information Rules, supra note 152. at 103—34.2003] INTELLECTUAL PROPERTY POLICY 573
neering should always be allowed, even in cases like Connectix where mul-
tiple platform standards exist.

2. The Failings of the Commons Theory. — As an initial matter, it is im-
portant to understand that the commons conception of the Internet rests
in large part on a community that can enforce norms committed to open
architecture and nonproprietary development. In today’s Internet, how-
ever, the conditions that once nurtured that environment—considerable
government support, a small community of stakeholders, and the absence
of proprietary development—are increasingly no longer in place. Thus,
to the extent that the development of information platforms reﬂects the
lessons of managing other common resources, the increasing number of
interested parties and diversity of interests suggests that solutions like
open source development and the creation of common, nonproprietary
standards will become the exception, not the norm.'57
Second, in terms of standard-setting committees, there are good rea-
sons to believe that the stance taken by the W3C in rejecting the use of
patented technologies may be the exception in the Intemet’s future de-
velopment. Most other standard-setting bodies, like the IETF, have toler-
ated patented technologies, provided that they are licensed at reasonable
and nondiscriminatory terms.158 This acceptance reﬂects the fact that
stakeholders in the Intemet’s development and participants in standard-
157. The literature documenting how common property can be managed is now quite
rich. Two classic studies that highlight the challenges of increasing numbers and diversity
are Robert C. Ellickson, Order Without Law: How Neighbors Settle Disputes (1991), and
Elinor Ostrom, Governing the Commons: The Evolution of Institutions for Collective
Action (1990).

158. See Martin Libicki et al., Scaffolding the New Web: Standards and Standards
Policy for the Digital Economy 31 (2000), available at http://www.rand.org/publications/
MR/MR1215 (on ﬁle with the Columbia Law Review); see also Patent Policy Working
Group, World Wide Web Consortium, Response to Public Comments on the W3C Patent
Policy Framework Working Draft, at http://www.w3.org/2001/10/patent-response (last
visited Oct. 24, 2002) (on ﬁle with the Columbia Law Review) [hereinafter Patent Policy
Working Group, Response] (noting that the IETF’s policy reﬂects the norm among
standard-setting bodies). The policy of the American Nationalization Standardization
Institute (ANSI). which coordinates standardization in a variety of industries, requires
companies with patented technologies to disclose any proprietary technology included
within a proposed standard and to agree to provide free or reasonable and
nondiscriminatory licenses to any patented technologies. See ANSI’s Procedures for the
Development and Coordination of American National Standards, reprinted in Raymond T.
Nimmer, Standards, Antitrust, and Intellectual Property, in Intellectual Property Antitrust
1995, at 797, 851—52 (PLI Patents, Copyrights, Trademarks, and Literary Prop., Course
Handbook Series No. G-414, 1995); see also Inst. of Electrical and Electronics Eng‘rs,
lEEE—SA Standards Board Operations Manual, cl. 6.3.2 (2000), at http://
standards.ieee.org/guides/opman/sect6.html (on ﬁle with the Columbia Law Rnﬁau). For
a very thorough study of the issue of standard-setting organizations’ intellectual property
rules, see Mark A. Lemley, Intellectual Property Rights and Standard-Setting
Organizations, 90 021. L. Rev. 1889 (2002) [hereinafter Lemley, Intellectual Property
Rights]; see also Mark R. Patterson, Inventions, Industry Standards, and Intellectual
Property, 17 Berkeley Tech. LJ. 1043, 1056—78 (2002) (discussing challenge of how to
value invention included within a standard).574 COLUMBIA LAW REVIEW [Vol. 103:534
setting bodies have become more diverse and focused on proﬁts.'5‘-’
Nonetheless, standard-setting committees like the IETF and the W3C still
can provide a forum for negotiating between different proprietary inter-
ests and developing common standards that will beneﬁt the entire com-
munity, but this role differs from a communal commitment to certain
values.“i0 Finally, even to the extent that groups like the W3C reject the
use of patents in their endorsed standards, it remains to be seen when
and how this will be enforced.““
Third, the claim that network markets will invariably tip to a single
standard and thus platform standards should not be protected under in-
tellectual property law overlooks important reasons why network competi-
tion can occur.162 Signiﬁcantly, the tipping prediction does not take ac-
159. Cargill, supra note 32, at 259 (describing how commercialimtion affects
workings of the lETF); Libicki et al., supra note 158. at 21 (“Five to ten years ago, IETF
standards meetings were dominated by academics and other computer scientists; these
days. businesspeople are likely to make up the overwhelming majority of participants—
even when the subject is libraries"): Paul A. David 8c Mark Shunner. Formal Standards-
Setting for Global Telecommunications and lnformation Services, 20 Telecomm. Pol’y
789, 795 (1996) (“[T]he outcome of deliberations among electrical and electronic
engineers (in committees of the IEEE) more often reﬂect considerations other than an
objective assessment of the technology"). The W3C’s lack of any stated policy on
intellectual property rights became a problem for the organization and spurred the
development of one. See Patent Policy Working Group, Response, supra note 158 (noting
emergence of the issue and suggesting that an approach to standards that denies the
proliferation of software patents would be irresponsible); Michael Champion, Patents and
Web Standards Town Hall Meeting, O'Reilly XML.com, Dec. l9, 200], at http:/,/
www.xml.com/‘pub/a/200l/'l2/19/patents.html (on ﬁle with the Columbia. Law Rwirw)
(discussing emergence of issue and likely adoption of policy that would prefer. bttt not
commit exclusively to. royalty free standards by May 2002); see also Maurits Dolmans.
Standards for Standards, 26 Fordham lnt'l L.). 163, 183 (2002) (suggesting that a
requirement by the W3C of “royalty-free licensing of [intellectual property rights used in
ofﬁcial standards] could discourage innovation, and by limiting the pool of available
technologies, might. result in the selection of second-class technology as Internet
standards").

160. See David 8c Shurmer, supra note 159, at 789 (noting that standard-setting
bodies “can be viewed as a response to the difﬁculties of achieving coordination in a purely
market-driven process”); Schallop. supra note 26, at 205 (commenting that “the
importance of standards organizations, to some extent, temper [sic] the market power and
de facto standard dominant players” in particular contexts); Wylie Wong, The Future: Sun
Pins Hopes on Web Services, CNET News.com, Mar. 28, 2002, at http://news.com.com/
2009-l001-869770.html (on file with the Columbia Law Review) (“Every company involved in
a standards organization has its own proprietary interests at heart"): see also Berners—Lee,
supra note 8. at 91—95 (discussing the rationale for the establishment of the W3C).

161. See Lisa M. Bowman. .Net Patent Could Stiﬂe Standards Effort, CNET
News.com. Feb. 10. 2003. at http://'news.com.com/2100-1001-984052.html (on tile with
the Columbia Law Review) (reviewing a number of strategies contemplated by free software
supporters. ranging from development of a W3C policy on inclusion of patented
technology to calls for boycotts “of companies that aggressively enforce patents”).

l62. See, e.g.. W. Brian Arthur, Increasing Returns and the New World of Business.
Harv. Bus. Rev.. july—Aug. l996. at 100. l02—07 (reviewing competition in knowledge-
based industries). The economists’ amicus brief to the Supreme Court in the Lotus case
suggested that because. network markets inexorably put new entrants at a disadvantage,2003] INTELLECTUAL PROPERTY POLICY 575
count of the likely scenario where a network effect (the value of
additional customers) declines at some point in time because the network
size has reached critical mass or where a rival network is able to overcome
the ﬁrst mover's initial advantage.‘63 In markets where the critical mass is
small enough to accommodate multiple providers of a particular product
or service, multiple ﬁrms will compete at the platform level, as they cur-
rently do in the market for video game consoles and cell phones.164
Moreover, it is quite clear that consumers’ demand for variety can com-
pensate for a lack of a strong network effect.165
Finally, it merits noting that some advocates of a commons model,
like Professor Lessig, view open source not as an optimal goal for eco-
nomic regulation, but as a means of protecting broader public values.166
This endorsement is consistent with a recognition that experiences like
the fragmentation of the Unix operating system suggest that strong gov-
ernment support may be necessary to support research and development
of open and common standards. This response, after all, is the typical
one for a public goods problem and was the posture that the US. govem-
access to interfaces is necessary to ensure fair competition. See Brief Amicus Curiae of
Economics Professors and Scholars in Support of Respondent at 7-8, Lotus Dev. Corp. v.
Borland Int'l, Inc., 49 F .3d 807 (1st Cir. 1995) (No. 94-2003), available at http://
elsa.berkeley.edu/users/woroch/amicustt (on ﬁle with the Columbia Law Review) (noting
that I‘if interfaces are public, competitors can make their products compatible, and users
will be able to choose a program on the basis of its quality and price”).

163. For a discussion of the critical mass concept and the nature of consumer
adoption of new innovations, see Everett M. Rogers, Diffusion of Innovations 313—34 (4th
ed. 1995); see also id. at 221 (explaining how incentives can be effective at increasing
adoption rates). For a discussion of the nature of networks and why many of them do not
tip to a single standard, see Albert-Laszlo Barabasi, Linked: The New Science of Networks
94—98 (2002).

164. See infra Part IV.A.1. The analogy of a proliferation of languages suggests a role
for niche and rival platforms. See Edward L. Rubin, Computer Languages as Networks and
Power Structures: Governing the Development of XML, 53 SMU L. Rev. 1447, 1448 (2000)
(comparing XML, a network standard, to languages) (citing David Crystal, The Cambridge
Encyclopedia of Language app. III, at 436—44 (1987)).

165. Katz 8c Shapiro, Systems Competition, supra note 35, at 106 (“Consumer
heterogeneity and product differentiation tend to limit tipping and sustain multiple
networks.”); Willow A. Sheremata, Barriers to Innovation: A Monopoly, Network
Extemalities, and the Speed of Innovation, 42 Antitrust Bull. 937, 966 (1997) (noting that
high value for variety can overcome the advantage of a strong network effect). In addition,
other factors can minimize the advantage of a network leader. Among other things,
adding customers onto a network can create congestion problems of different sorts—
including customer service support, for example—and marketing costs for customer
acquisition can be a substantial, recurring cost See William]. Kolasky, Network Effects: A
Contrarian View, 7 Geo. Mason L. Rev. 577, 586—89 (1999) (explaining how networks can
face congestion costs).

166. See Lawrence Lessig, The Limits in Open Code: Regulatory Standards and the
Future of the Net. 14 Berkeley Tech. LJ. 759, 764—66 (1999) (arguing that open code
embodies important values for cyberspace); lawrence Lessig, Open Code and Open
Societies: Values of Internet Governance, 74 Chi-Kent L. Rev. 1405, 1406—09 (1999)
(same).576 COLUMBIA LAW REVIEW [Vol. 103:534
ment took during the earlier years of the Internet’s development.‘67 Pro-
fessor Lessig‘s writings, however, acknowledge that such levels of govern-
ment support are unlikely, leading him to concede the likelihood that
the Internet will increasingly be subject to the control of proprietary
f1rms.‘68
B. The Proprietary Control Model and the Schumpeterian justification
The success of the Internet and open source development represents
a fundamental challenge to the traditional model of proprietary software
development, which still remains dominant and is exempliﬁed (for good
and bad) most clearly by Microsoft.169 Microsoft and other proprietary
software vendors, unlike open source developers, do not rely on a dis-
persed community of developers contributing to a common project, but
rather on a team of developers centralized at corporate headquarters. As
such, proprietary ﬁrms expect to recoup substantial returns from their
work and do not release the source code of their products for free (or at
all, in most cases). Not surprisingly, such ﬁrms challenge the open
source movement as foolhardy and counterproductive.‘7"
l. The Proprietary Control Model. — Believers in the proprietary con-
trol model view the challenges for supremacy among ﬁrms as part of an
ongoing battle that the late economist joseph Schumpeter called “crea-
tive destruction.”‘7l On this view, any market power will be temporary, as
167. See supra notes 9 and 34 and accompanying text.

168. See Lessig, Code, supra note 1, at 225 (concluding, after highlighting the
importance of open code, that “[t] he politics is [sic] just not there").

169. See Stephen Shankland, Study: Linux Sales Down, but Not Out, CNET
News.com, Aug. 6, 2002, at http://news.com.com/2102-1001-948678.htm1 (on ﬁle with the
Columbia Law Review) (describing Microsoft‘s dominance in the operating system market).

170. For Microsoft‘s most public criticism of the movement, see Craig Mundie, The
Commercial Software Model, Remarks at the New York University Stern School of Business
(May 3, 2001), at http://www.microsoft.com/presspass/exec/craig/O5-035haredsource.asp
(on ﬁle with the Columbia Law Review); see also Craig Mundie, Commercial Software.
Sustainable Innovation, CNET News.com, May 17. 2001, at http://news.com.com/2010-
1078-281466.htm1?1egacy=net (on ﬁle with the Columbia Law Review) (“In a nutshell, [CPL]
debases the currency of the ideas and labor that transform great ideas into great
products”). Craig Mundie is a Senior Vice President at Microsoft.

171. joseph A. Schumpeter, Capitalism, Socialism, and Democracy 81—90 (2d ed.
1947); see Posner, supra note 16, at 930 (“The gale of creative destruction that
Schumpeter described, in which a sequence of temporary monopolies operates to
maximize innovation that confers social beneﬁts far in excess of the social costs of the
short-lived monopoly prices that the process also gives rise to, may be the reality of the new
economy"). Schumpeter‘s early work, while also focused on innovation, suggested that
small entrepreneurs are critical to facilitating the advance of technology. See joseph
Schumpeter, The Theory of Economic Development: An Inquiry into Proﬁts, Capital,
Credit, Interest, and the Business Cycle 132—33 (1934); see also F.M. Scherer, Schumpeter
and Plausible Capitalism, 30 j. Econ. Literature 1416, 1417 (1992) [hereinafter Scherer,
Plausible Capitalism] (noting that for Schumpeter, “innovation . . . was driven by the
entrepreneurial activity to which the capitalist system's rewards and opportunities were
uniquely conducive").2003] INTELLECTUAL PROPERTY POLICY 577
a new technology will ultimately knock off every incumbent”? As two
commentators recently put it, Schumpeter’s hypothesis is that “ﬁrms
compete through innovation for temporary market dominance, from
which they may be displaced by the next wave of product advance-
ments.”'73 Although this position rests on three analytically distinct pro-
positions, the strong version of the Schumpeterian contention is that mo-
nopolies are both acceptable and necessary to facilitate technological
innovation. 17“
The Schumpeterian justiﬁcation for strong intellectual property pro-
tection underlies the basic theory behind Edmund Kitch’s “prospect the-
ory” vision of the patent system.175 This theory suggests that broad pro-
tection of patent rights can ensure that a single ﬁrm can both
appropriate gains from and coordinate the development of a new tech-
nology.176 Consequently, it challenges limiting doctrines—like those that
facilitate access through reverse engineering—as cutting against the con-
trol of an inventor in managing development through licensing. Thus,
Kitch's theory and the proprietary control model together represent an
important strand in intellectual property theory,177 supporting claims
such as Professor Miller’s argument that copyright law should categori-
172. See Thomas A. Piraino, Jr., An Antitrust Remedy for Monopoly Leveraging by
Electronic Networks, 93 Nw. U. L. Rev. 1, 2 (1998) (terming this free market perspective
the “'Marketeers'" view); Richard Schmalensee, Antitrust Issues in Schumpeterian
Industries, 90 Am. Econ. Rev. 192, 194 (2000) (arguing that in a struggle for survival the
intent to exclude is the intent to survive).

173. Howard A. Shelanski 8: J. Gregory Sidak, Antitrust Divestiture in Network
Industries, 68 U. Chi. L. Rev. 1, 10—11 (2001); see also Scherer, Plausible Capitalism, supra
note 171, at 1418 (arguing that innovation “undermine[s] the market positions of ﬁrms
committed to old ways of doing business”).

174. See Richard R. Nelson 8c Sidney G. Winter, The Schumpeterian Tradeoff
Revisited, 72 Am. Econ. Rev. 114, 114 (1982) (deﬁning Schumpeterian hypothesis as
positing that “[a] market structure involving large ﬁrms with a considerable degree of
market power is the price that society must pay for rapid technological advance”); F.M.
Scherer, Antitrust, Efficiency, and Progress, 62 N.Y.U. L. Rev. 998, 1010 (1987)
[hereinafter Scherer, Antitrust] (noting that Schumpeter’s hypothesis encompasses the
points that (1) only large businesses can achieve sufﬁcient scale to invest in research and
development and bear the necessary risks, (2) the proﬁts yielded by monopoly are an ideal
fund to support research and development, and (3) a monopoly position is necessary to
ensure that a business can appropriate the beneﬁts of research and development
expenditures).

175. See Edmund W. Kitch, The Nature and Function of the Patent System, 20 J.L. 8c
Econ. 265, 266 (1977).

176. For a thorough critique of this theory, see Merges 8c Nelson, supra note 37, at
871—78.

177. Although Schumpeter’s work has informed a number of intellectual property
arguments (like Kitch's), it has failed to gain much currency in antitrust thinking. See
Robert P. Merges 8c Richard R. Nelson, Market Structure and Technical Advance: The
Role of Patent Scope Decisions, in Antitrust, Innovation, and Competitiveness 184, 186
(Thomas M. jorde 8c David]. Teece eds., 1992).578 COLUMBIA LAW REVIEW [Vol. 103:534
cally reject any privilege for the reverse engineering of software
programs.'78
The proprietary control model embraces a rich tradition in intellec-
tual property theory that without an appropriate incentive, inventors will
not create new innovations. In the Internet context, both the Clinton
Administration’s embrace of strong intellectual property protection in
the e-commerce area and the endorsement of the so-called “business
method patents" reﬂect this perspective.‘79 In particular, this vision
places a premium on ensuring that ﬁrms reap proprietary rewards for
innovating in the Internet environment. On this view, proprietary con-
trol of intellectual property does not simply provide the important incen-
tive to invent new technologies, but also ensures that such technologies
are maintained carefully and put to their best use.180
Relying on proprietary development provides a clear answer to a po-
tential weakness of the open source model: It boasts a clear ability to
develop and deploy talented leadership and coordination to ensure that a
standard does not fragment within a wide user base. To be sure. the
Linux operating system continues to build support, but the history of the
Unix operating system suggests that open source standards like Linux
face long odds in displacing the dominant proprietary model of software
development.”” Second, a real weakness of open source projects is that
they do not generate any direct ﬁnancial beneﬁts for their inventors, so
they can fall prey to the public goods problem of being subject to under-
investment. Sun’s experience with its open Java standard (which relies
on a “community source license” that is somewhat similar to the open
178. See Miller. supra note 96, at 1023—26.

179. See Amazon.com, Inc. v. BarnesandNoble.com, 1nc., 73 F. Supp. 2d 1228, 1228
(W.D. Wash. 1999) (providing a preliminary injunction for Amazon‘s l—click patent for
engaging in electronic commerce), vacated, 239 F.3d 1343 (Fed. Cir. 2001); Clinton 8c
Gore, jr., supra note 30, at 9—13; Q. Todd Dickenson. E-Commerce, Business Method
Patents, and the USPTO: An Old Debate for a New Economy, 19 Cardozo Arts 8c Ent. L].
389, 398—99 (2001) (defending business method patents); see also Frank H. Easterbrook,
Cyberspace Versus Property Law?, 4 Tex. Rev. L. 8: P01. 103, 106 (1999) (“Curtail the top
returns, and the whole structure of rewards changes for the worse."). For two critical
appraisals of the effort to extend patent protection to the business method context, see
james Gleick. Patently Absurd, NY. Times (Magazine), Mar. 12, 2000, at 44; Tim O'Reilly,
An Open Letter to jeff Bezos. Feb. 28. 2000, at http://www.orei11y.com/cgi—bin/
amazon_patent.comments.pl (on ﬁle with the Columbia Law Review).

180. See Douglas C. Baird, Does Bogart Still Get Scale?, 4 Green Bag 2d 357, 363
(2001) (arguing that without intellectual property protection, cheap reproductions would
dilute and tarnish creative works); Bell, supra note 86, at 758—60.

181. For a thoughtful discussion of the open source model, see David McGowan.
Legal Implications of Open-Source Software, 2001 U. 111. 1... Rev. 241; see also Weiser.
Information Platforms, supra note 33, at 25—29 (outlining reasons for skepticism). As for
Linux, its role as a bulwark against Microsoft’s dominance may well attract sufﬁcient
support from computer industry leaders to enable it to survive and even thrive. See
Nicholas Petreley. Linux Road Map Needed, Computerworld, Sept. 24, 2001. at 47. ~17
(explaining the need for a group to develop and maintain Linux standard and noting that
Hewlett Packard is taking a leading role in supporting this effort).2003] INTELLECTUAL PROPERTY POLICY 579
source model) is telling on this score: “For all its hype and popularity,
Java has made more money in direct software sales for competitors than
for the company that invented it."182 To be sure, the invention of Java
did bring considerable recognition and indirect beneﬁts to Sun, but it is
far from clear that Sun has appropriated enough beneﬁts from java to
justify its investment in the technology.‘83
In the computer world, the proprietary model relies on the ability of
software ﬁrms to maintain close control over the application program-
ming interfaces (APIs) for the programs they develop. These interfaces
can be analogized to the “gear teeth, levers, pulleys, and belts that physi-
cal machines use to interoperate.”184 In the context of proprietary
software, control over these interfaces enables the platform owner to
maintain control over its platform both defensively—to prevent rivals
from cloning its products—as well as offensively—to prevent competitors
from creating compatible products. In the government's antitrust case
against Microsoft, for example, the government submitted evidence of a
manager’s statement that “‘to control the APIs is to control the indus-
try’ ”'35 and established that Microsoft’s monopoly rested, in part, on its
ﬁrm control of its APIs.186
2. The Failings of the Propﬁetaty Contml Theory. — Even though there
are important reasons to allow for the development of proprietary tech-
nologies as a means of facilitating new innovations, there also are reasons
to doubt Schumpeter’s claim that complete control over an industry’s
standards by large ﬁrms like Microsoft will be good for consumers and
will be checked by future innovation.‘87 As an initial matter, current eco-
nomic thinking suggests that while larger ﬁrms may enjoy some advan-
tages in fostering innovation, the Schumpeterian hypothesis is not sup-
ported by the evidence,188 in part because smaller ﬁrms tend to be more
182. Stephen Shanldand, The Goal: Sun Looks for Payoff tojava Addiction, CNET
News.com, Mar. 25, 2002, at http://news.com.com/2009-1001-866365.html (on ﬁle with
the Columbia Law Review).

183. See Bill Whyman, Sun’s Bigger Troubles, Software Transformation Series
(Precursor Group, Wash., D.C.), Apr. 10, 2002 (on ﬁle with the Columbia Law Review)
(“The relative openness of java, which successfully created its growth, is at odds with a more
closed effort to capture its value.”).

184. Samuelson et al., supra note 35, at 2321.

185. Thomas A. Piraino, Jr., Identifying Monopolists' Illegal Conduct Under the
Sherman Act, 75 N.Y.U. L. Rev. 809, 888—89 (2000) (quoting Microsoft manager’s internal
e—mail).

186. See United States v. Microsoft Corp., 65 F. Supp. 2d 1, 15 (D.D.C. 1999)
(suggesting that process of reverse engineering Windows is so time consuming that it could
not be done successfully); see also jonathan Band, Paragraph 52: A Window into judge
jackson's Findings of Fact, Computer l..aw., Mar. 2000, at 3, 4 (same).

187. In terms of challenging the perspective at a theoretical level, Kenneth Arrow
famously countered that competition provides the best spur to innovation. Kenneth J.
Arrow, Economic Welfare and the Allocation of Resources for Invention, in Essays in the
Theory of Risk-Bearing 144, 156—60 (1971).

188. See Wesley M. Cohen 8c Richard C. Levin, Empirical Studies of Innovation and
Market Structure, in 2 Handbook of Industrial Organization 1059, 1078 (Richard580 COLUMBIA LAW REVIEW [V0]. 103:534
efﬁcient, productive, and aggressive about pursuing innovation.'“‘-’ Ac-
cordingly, Scherer and Ross conclude that “[t]echnological progress
thrives best in an environment that nurtures a diversity of sizes and, per-
haps, especially, that keeps barriers to entry by technologically innovative
newcomers low.”‘90
Second, to the extent that some size may be helpful in more estab-
lished industries, there is reason to think that this is less true for the infor-
mation industries where there is a greater need for intellectual capital
than physical capital, and the ﬁxed costs necessary for research and devel-
opment are considerably less. Cisco, for example, despite its overwhelm-
ing size, relies on outsourcing for much of its research and development
through purchasing start-up companies.”Jl Similarly, start-up companies
Schmalensee 8c Robert D. Willig eds.. 1989) ("[T]he effects of ﬁrm size and concentration
on innovation, if they exist at all, do not appear to be important.”); Edwin Mansﬁeld.
Industrial Research and Technological Innovation: An Econometric Analysis 43 (1968)
(“[E]xcept for the chemical industry, there is no evidence that the largest ﬁrms [in
petroleum, drugs, steel, and glass] spent more on research and development . . . than did
somewhat smaller ﬁrms“): Michael E. Porter, The Competitive Advantage of Nations
527—30, 577—89 (1990) (showing that monopolists in mature markets have an incentive to
suppress new technology so as to protect their sales revenue from existing products in
markets they dominate); Scherer. Antitrust, supra note 174. at 1012 (concluding that
“relatively small ﬁrms and ‘outsiders‘ appear to originate a disproportitmate fraction of the
most radical innovations“); Scherer, Plausible Capitalism, supra note 171. at 1425
(asserting that “theoretical and empirical work" for the ﬁfty years following Schumpeter's
conjecture provides “at best meager support"). To be fair. it merits notice that
Schumpeter's focus on innovation—or dynamic efﬁciency. as economists often call it—
facilitated the study of the area, even if his suggestion that monopolies could inucwate in a
superior fashion proved to be suspect. In this respect, the counterhypothesis offered by
Arrow is, in some sense, in the Schumpeterian tradition of focusing on innovation. See
generally Arrow, supra note 182. at 156—60.

189. See F.M. Scherer. Innovation and Growth: Schumpeterian Perspectives 246—47
(1984) [hereinafter Scherer. Innovation and Growth] (concluding from empirical studies
that entrenched monopolists tend to be averse to innovation for fear that new products
will cannibalize revenues from their existing products); Wesley M. Cohen 8: Steven
Klepper, A Reprise of Size and R 8: D, 106 Econ._]. 925, 925 (1996) (concluding that, in
academic circles. an “enduring consensus emerged long ago that large ﬁrms have no
advantages in R 8: D competition and may even suffer disadvantages’); id. at 929
("[S]maller ﬁrms accounted for a disproportionately large number of patents and
innovations relative to their size“); Douglas H. Ginsburg, Antitrust. Uncertainty, and
Technological Innovation, ‘24 Antitrust Bull. 635, 649 (1979) (“Studies have indicated . . .
that small ﬁrms are more efficient than larger ones in conducting research").

190. F .M. Scherer 8: David Ross, Industrial Market Structure and Economic
Performance 660 (3d ed. 1990). Admittedly, this is a broad generalization. where results
will vary from industry to industry. See, e.g.. Levin et a1., supra note 145, at 812—15
(highlighting “sources of interindustry difference in R&D spending and the rate. of
technological advance").

191. See Gawer 8c (Zusumano, supra note 45, at 167—73; Ben Elgin, A Do-lt Yourself
Plan at Cisco, Bus. Wk, Sept. 10, 2001, at 5‘2, 52 (noting that since 1993 Cisco acquired
more than seventy companies, including many start-ups as its primary R&D strategy); see
alsoJoshua S. Gans 8: Scott Stern. Incumbency and R&D Incentives: Licensing the Gale 01'
Creative Destruction, 9]. Econ. 8c Mgmt. Strategy 485, 504—05 (2000) (examining how this
practice contrasts sharply with the Schumpeterian perspective).2003] INTELLECTUAL PROPERTY POLICY 581
ﬁnanced by venture capitalists have undertaken risky research and devel-
opment efforts that have produced a signiﬁcant number of patents.192
Finally, two critical concerns underscore why pure Schumpeterian
thinking should not drive intellectual property policy. First, although
monopolies such as IBM and Microsoft may be dethroned at some point,
the exercise of monopoly power in the meantime—which may well be
several decades—still can injure consumers.‘93 In the case of Microsoft,
its ability to maintain and control closed, de facto industry standards—as
opposed to open, de jure ones endorsed by standard-setting commit-
tees—has enabled it to exercise great inﬂuence over other companies. In
particular, Microsoft has used this control to undermine support for Sun
Microsystems’s open java standard.194
A second, and more fundamental, criticism of the proprietary con-
trol model is that numerous studies have shown that incumbent monopo-
lies will often fail to develop and deploy radically new technologies,195
192. See Samuel Kortum 8c josh Lerner, Assessing the Contribution of Venture
Capital to Innovation, 31 RAND]. Econ. 674, 676—81 (2000) (providing statistical evidence
of the importance of venture funding on patent activity). As to smaller ﬁrms, however, it
may well be the case that patents and intellectual property provide an important incentive
and means of justifying their value. See Mazzoleni 8c Nelson, supra note 145, at 274
(noting absence of focus on smaller ﬁrms in research on importance of patents); see also
Ferguson, supra note 25, at 25] (suggesting that intellectual property protection created
value in start-up ﬁrm); Levin et al., supra note 145, at 797 (observing that for start-ups,
patents may be particularly important, because other means of appropriating innovations
are not feasible and because patents may be a marketable asset). Although it could be the
case that venture capital ﬁrms appreciate the presence of patents as a psychological beneﬁt
even if they have minimal actual market impact, Kortum 8c Lerner‘s study suggests that
venture capital backed patents do not appear to be lower quality patents. Kortum 8c
Lerner. supra, at 689—91.

193. See Michael E. Porter, Competition and Antitrust: Towards a Productivity-based
Approach to Evaluating Mergers and joint Ventures, 33 UWLA L. Rev. 17, 33 (2001) (“In
truth, drastic innovations in industries occur only once every few decades, so that
dominant positions create substantial costs to productivity growth and to society.”); F.M.
Scherer, Some Principles for Post-Chicago Antitrust Analysis, 52 Case W. Res. L. Rev. 5, 10
(2001) (noting that it took seventy-ﬁve years for rivals to erode U.S. Steel’s monopoly and
ﬁfty-ﬁve years to erode General Motors's, and that Microsoft has enjoyed a near monopoly
position in the personal computing operating system market for almost two decades);
Sheremata, supra note 165, at 963 (“To say . . . that automobiles eventually replaced horses
is to ignore the impact to welfare of innovation delayed”).

194. See United States v. Microsoft Corp., 65 F. Supp. 2d 1, 20—21 (D.D.C. 1999)
(discussing Microsoft's fear of Java's ability to diminish the applications barrier to entry).

195. See, e.g., jonathan B. Baker, Fringe Firms and Incentives to Innovate, 63
Antitrust LJ. 621, 634 (1995) (observing that leading firms face pressure either to deter
rival innovation—through predatory conduct or preemptive innovation—or to
accommodate it); Mary Tripsas, Unraveling the Process of Creative Destruction, 18
Strategic Mgrnt. j. 119, 119 (1997) (citing examples to demonstrate that the “continual
failure of established ﬁrms in the face of radical innovation has been documented in a
number of empirical studies”). Three relatively recent examples illustrate this
phenomenon. First, despite the proven use of ﬁber optic technology in
telecommunications, AT8cT failed to deploy it until Sprint and other upstarts did and
began advertising a superior quality network. See Howard A. Shelanski, Competition and582 COLUMBIA LAW REVIEW [Vol. 1032534
sometimes even using their current monopolies to distort and thwart the
process of competing to introduce more innovative products.‘96 Indeed,
this very concern motivated AT&T’s decision not to embrace the Internet
at its creation as well as to slow roll the deployment of wireless telephone
service.‘97 Thus, an important role for regulation is to “keep entry open
so that challengers with new ideas can force the pace of innovation.""~’“
In short, the commons model’s basic insight—that the Internet pro-
vided an avenue for entry because of its open and common platform—
can still guide the Internet’s future even with an allowance for the devel-
opment of proprietary standards. By contrast, an acceptance of domi-
nant platform standards may create more value for the individual compa-
nies, but can leave the Internet community itself worse off, where would-
be improvers lack access to the particular proprietary platform (or only
gain access under onerous terms).'99 To solve this problem and to facili—
Deployment of New Technology in U.S. Telecommunications, 2000 U. Chi. Legal F. 85.
107—08. Second, even though DSL technology had been developed in the 19805, the Bell
Companies did not begin deploying it until the cable companies began deploying cable
modems. See id. at 111. Finally, new entrants into access exchange markets used cutting
edge telecommunications technology to provide higher quality and more reliable service
than that afforded by the old copper networks of the incumbent providers. See Thomas
M._]orde et al., Innovation, Investment, and Unbundling, 17 Yale]. on Reg. 1, 9 (2000).

196. See David j. Teece. Proﬁting from Technological Innovation: Implications for
Integration, Collaboration, Licensing and Public Policy, 15 Res. Pol’y 285, 291—92 (1986)
(noting how incumbent monopolies often withhold cooperation with respect to their
complementary assets to stall competitive innovation). Such measures, as established
caselaw underscores, warrant antitrust oversight. See Standard Fashion Co. v. Magrane—
Houston Co., 258 U.S. 346, 355—57 (1922); Posner, supra note. 16, at 933—35.

197. See john Naughton, A Brief History of the Future 107 (2000) (quoting AT8cT
executive as stating about the Internet that "it can't possibly work. and if it did, damned if
we are going to allow the creation of a competitor to ourselves”); Rudolfo Lujan Baca.
Effect of the FCC Regulatory Process on the Investment Community, 2001 L. Rev. Mich. St.
U.—Det. CL 339. 340 (noting AT&T's prediction of wireless its a niche service and
suggesting that AT&T, if left to manage it, would have kept it that way); see also Blair
Levin. The Innovation Dilemma. CNET News.com. Mar. 18. 2002. at http://
news.com.com/2010—lO78-861972.html (on ﬁle with the Columbia Law Review) (noting how
competition spurred innovation in both the wireless and data networks contexts).

198. Scherer, Antitrust, supra note 17-4, at 1014; see also Richard N. Langlois,
Technological Standards. Innovation. and Essential Facilities: Towards a Schttmpeterian
Post-Chicago Approach, in Dynamic Competition and Public Policy: Technology,
Innovation, and Antitrust Issues 193, 207 (jerry Ellig ed., 2001) ("[I]nnovation normally
proceeds fastest when a large number of distinct participants are trying multiple
approaches simultaneously."); Shane Greenstein, The Three Coms of the Microsoft
Antitrust Suit: Competition Policy, Commercial Experimentation, and Computing
Platfomis, 32 UWLA L. Rev. 95, 100 (2001) (noting how experimentation and innovation
requires multiple points of entry); Sheremata, supra note 165. at 944 (“When owners of a
current technology raise artiﬁcial barriers to entry of new technology, opportunities for
innovation decline to the detriment of consumers").

199. See Weiser, Internet Governance, supra note 3. at 829—30 (arguing that "the
larger the Internet community becomes, the more difﬁcult it is to maintain a completely
‘commons’ model”). Put differently, the concern is that the Internet commons will be
fully proprietized and subject to enclosure by commercially owned technologies. See2003] INTELLECTUAL PROPERTY POLICY 583
tate continued innovation in the Internet environment will require a
combination of private and public responses: the leadership of standard-
setting committees, enlightened self interest on behalf of companies in
the marketplace, some well-targeted government subsidies for basic re-
search, and appropriate antitrust and telecommunications regulation, as
well as—the primary focus of this Article—a well-formulated and coher-
ent intellectual property policy.200
IV. TOWARD A COMPETITIVE PLATFORMS MODEL FOR THE INTERNET AND
THE INFORMATION INDUSTRIES
The polarizing debates between the commons and proprietary con-
trol models threaten to eclipse a third way for the Internet and informa-
tion industries to develop: the competitive platforms model. Those en-
amored of Schumpeterian thinking often suggest that any attempt to
promote access to a proprietary platform is misguided on the ground that
any incumbent platform standard ultimately will be displaced entirely.
Those commons advocates who maintain that network markets invariably
will tip to a single standard tend to argue that all information platform
standards must be kept open, lest their owners limit innovation. By incor-
porating important insights from both perspectives, the competitive plat-
forms model provides a new framework for intellectual property law that
reconciles the need to confer the investment incentives necessary to spur
innovation with the risk of protecting proprietary dominance.201 This
model can also help policymakers appreciate how standard-setting and
government funding efforts should work together to develop and main-
tain uniform standards where proprietary ﬁrms would be unable or un-
willing to do so.

A. The Competitive Platforms Model and Intellectual Property Law Reform
The competitive platforms model provides a vision for when and
how intellectual property should be treated as a limited—as opposed to a
Lawrence Lessig, Internet Under Siege, Foreign Policy, Nov.—Dec. 2001, at 56, 56 (“It is the
enclosure of [the Internet’s] commons that will bring about the lntemet's demise.”); see
also Benkler, supra note 22. at 415 (identifying growing “enclosure movement” that will
limit use of information available via the Internet).

200. The difﬁculty of expanding on a more precise explanation of how each of these
tools should be used in combination with one another to stimulate innovation results in a
lack of attention by scholars to this question. See Brett Frischmann, Innovations and
Institutions: Rethinking the Economics of U.S. Science and Technology Policy, 24 Vt. L.
Rev. 347, 350 (2000) (“Despite wide recognition that socially efficient production of
innovation (of all types) requires a comprehensive, complicated ‘mix' of federal
institutions, comparative institutional analysis is lacking, particularly in terms of mixed
systems that rely on multiple institutions“).

20]. A basic reason for a more cautious and less intrusive strategy is that, with regard
to network markets, “we are far from having a general theory of when government
intervention is preferably to the unregulated market outcome." Katz 8:: Shapiro, Systems
Competition, supra note 35, at 113.584 COLUMBIA LAW REVIEW [Vol. 1032534
pure—commons.202 As to property law, Carol Rose has explained how
the common law recognized that. limited common property—such as
easements—in roads and waterways served to enable access to, and thus
more efﬁcient exploitation of, the surrounding private property.203 With
respect to intellectual property law, the appropriate conception of an in-
formation commons is less clearly developed; after all, we are still in the
formative stage of developing the basic infrastructure (of hardware and
software) for the Internet and the information economy.201 Thus, a criti-
cal challenge for policymakers and commentators is to understand what
role intellectual property law can play in fostering an information com-
mons as the Internet develops.

Following the competitive platforms model described below, intellec-
tual property rules (and regulation in general) should ensure that parties
maintain proprietary control over information platforms to provide the
necessary incentives for investment and innovation. Without such invest-
ment incentives and opportunities for rewards, the Internet will not con-
tinue to develop in a robust fashion. To be sure, preserving the common
platform provided by the basic standards of the Internet's logical layer is
essential, and intellectual property law should be sensitive to the need to
facilitate open access to a standard when it emerges as dominant.205 1f
the entire software infrastructure related to the Internet (or other infor-
mation platforms) is treated as a commons, however, then there will be
only limited opportunities to make money investing in its development.
To move back to Professor Rose’s metaphor: Easements serve the impor-
tant public purpose of making everyone’s property more valuable, but if
property law sought to dedicate all of a property holder’s rights to a com—
mons, the property holder would lose the incentive to develop her
property.206
202. Asjulie Cohen put it, “What is missing from the conventional economic wisdom
about property rights in general and intellectual property rights in particular is a
vocabulary for apprehending the link between incomplete control and productivity.
between ‘leaky' entitlements and public welfare, between chaos and creative ferment."
Julie E. Cohen, Copyright and the Perfect Curve, 53 Vand. L. Rev. 1799, 1818 (2000).

203. Rose, Comedy of the Commons, supra note 48, at 744—45; see also White v.
Samsung Elecs. Am., Inc., 989 F.2d 1512, 1513 (9th Cir. 1993) (Kozinski,_]., dissenting)
(explaining how providing some public access to creative works is crucial to innovation).

204. For an explanation of how an information commons could be fostered by
intellectual property rules, see Yochai Benkler, Siren Songs and Amish Children:
Autonomy, Information, and Law, 76 N.Y.U. L. Rev. 23, 84—88 (2001).

205. In so doing, the law may not only regulate the market by facilitating open
standards in certain situations, but also reinforce an important norm that prevailed during
the Internet's formative years. Cf. Arti Kaur Rai, Regulating Scientiﬁc Research:
Intellectual Property Rights and the Norms of Science, 94 Nw. U. L. Rev. 77, 88, 99 (1999)
(noting this point and highlighting role of government in encouraging norm of patenting
gene fragments).

206. See Rose, Comedy of the Commons, supra note 48, at 744—45 (explaining role of
easements).2003] INTELLECTUAL PROPERTY POLICY 585
A central tenet of the competitive platforms model is that, even if the
industry structure will ultimately rely on a single standard, competition
policy should still err on the proprietary side of the line, allowing rival
standards to battle it out in the marketplace. To be sure, promoting stan-
dards competitions risks forestalling, duplicating, and stranding invest-
ment,207 but even where a single standard ultimately emerges, the tempo-
rary competition is likely to produce a better outcome.208 Moreover, in
addition to maintaining the possibility of competition on quality, rival
standards also hedge against the risk that the single standard proves
ﬂawed in some fundamean matter.2°9 Finally, even though some plat-
form standards will appear to be susceptible to the tipping phenomenon,
policymakers and courts will not necessarily be able to predict which mar-
kets will tip and which standard will emerge as dominant. Consequently,
they should encourage rival platform standards, and only where a single
one emerges as dominant, facilitate and—if necessary—mandate access
to that standard.

1. Rival Platform Standards. — In the Internet context in particular
and the information industries more generally, standards competitions
can often be procompetitive by increasing innovation in a manner that
would not occur under cooperative efforts that settle on a lowest com-
mon denominator standard. The problem with joint standard-setting ef-
forts, such as those led by standard-setting bodies like the IETF, is that
they move slowly and need to satisfy a broad range of constituents.210
Indeed, even where the relevant market involves substantial capital ex—
penditures, such as the deployment of cell phone networks, rival stan-
dards can facilitate innovation and experimentation. Thus, in evaluating
the nature of a network market, rival standards may not only be sustaina-
ble, but also procompetitive. To be sure, this rivalry may well look more
like an oligopoly—with three or four rival platforms—than textbook
207. See Merges 8:. Nelson. supra note 37, at 870 (“In particular, under a wide range
of assumptions, tivalrous inventive efforts generate a great deal of inefﬁciency”).

208. See Robert]. Aiken 8cjohn S. Cavallini, When Are Standards Too Much of a
Good Thing? Will They Provide Interoperability for the National Information
Infrastructure?, in Standards Policy for Information infrastructure 253, 26] (Brian Kahin
8cjanet Abbate eds., 1995) (“[T]he overzealous creation and use of [ofﬁcial] standards.
either through formal standards processes or by government purchasing practices, poses
the risk of impeding the introduction of necessary new technologies and services . . . .").

209. One incident that would seem to support this concern is the use of a single
standard for encrypting digital versatile disks (DVDs) as a copy protection measure. Part of
why the DVD industry is so committed to using legal means to limit the use of the software
code that decrypts and unlocks the copy protection standard is that the industry is
completely dependent upon a single technology. See Universal City Studios v. Reimerdes,
82 F. Supp. 2d 211, 218—19 (S.D.N.Y. 2000) (enjoining distribution of a software program
that unlocks DVD copy protection standard).

210. See supra note 159 (noting how diverse commercial interests limit the
effectiveness of standard-setting bodies); see also Merges 8c Nelson, supra note 37, at 872
(suggesting that the theoretical beneﬁts of cooperative development are often not borne
out in practice).586 COLUMBIA LAW REVIEW [Vol. 1032534
competition?“ but there still are important payoffs to innovation from
competition among information platforms.

The case of wireless telephone standards provides an example of why
regulation should not be too quick to mandate—or even facilitate—hori-
zontal access and standardization across rival information platforms. In
Europe, regulators concluded that the market for wireless telephones was
“tippy” and thus decided to mandate a single standard. In particular, the
European Economic Community’s government standard-setting body,
European Telecommunications Standards Institute (ETSI), adopted the
Global System for Mobile Communications (GSM) as the only standard
for which equipment suppliers could provide wireless telephone equip-
ment. By contrast, US. regulators (in particular, those at the Federal
Communications Commission) decided to let the market determine
whether multiple standards could be supported and which one, if any,
was clearly superior. As it turned out, this experiment yielded three sepa-
rate standards—that is, two alternatives to CSM (Qualcomm’s Code Divi-
sion Multiplexing (CDMA) and Time Division Multiplexing (TDMA))—
all of which were deployed in the United States with minimal disruption
to consumers.”2 Most notably, the last standard to be deployed, CDMA,
uses spectrum more effectively than its predecessors by allowing numer-
ous subscribers to use the same channel and providing an easier migra-
tion path to next generation uses.‘~"-'" Consequently, the case of wireless
standards highlights the innovative payoff from the FCC’s decision not to
mandate a single standard.”4
As the wireless standards example illustrates, rivalry between alterna-
tive standards can not only increase innovation, but also lead information
211. See Scherer. Innovation and Growth, supra note 189, at 246.

212. See Kathleen M.H. Wallman, The Role of Government in Telecommunications
Standard-Setting. 8 CommLaw (Ionspectus 235. 246-47 (2000). Admittedly, consumers
with CDMA and TDMA did not have the convenience of being able to take their wireless
phones to Europe. but those who valued this opportunity could simply stick with a GSM
phone.

213. ()n the enhanced innovative opportunities offered by CDMA, see Libicki, supra
note 32, at 12—13 (suggesting standards competition may well be responsible for greater
security and ten-fold increase in capacity); Libicki et al., supra note 158, at 8, 10 (noting
CDMA's enhanced features and how its deployment spurred innovation by its
competitors); Steven Titch, Blind Faith, Telephony, Sept. 8, 1997. at 24, 26, 30 (noting that
different providers report anywhere from six— to eighteen-fold capacity increase). On the
beneﬁts in terms of a transition to the third generation standard, see Peggy Albright,
Charting the Course to 3G, Wireless Wk.,_]an. 8, 2001, at 25, 25; Lynette Luna, Battle of the
Standards, Telephony, Feb. 19, 2001, at 62, 62.

214. The wireless standard case study also highlights the dynamics introduced by a
world market. In that case, European users may actually beneﬁt from the standard-setting
competition in the United States without enduring the costs of that competition because
they can enjoy interoperability while also being able to incorporate the advances of CDMA
technology into a next generation standard. The questions raised by viewing the issue on
the international level implicate trade policy concerns as well as highlight how regulatory
rules—including intellectual property policy—may have. to be international in order to be
effective. A fuller discussion of these issues. however, is beyond the scope of this Article.2003] INTELLECTUAL PROPERTY POLICY 587
platform sponsors to work harder to build an installed base of customers
for their innovation. To do so, providers must work hard to build a value
network by assuring consumers that their products offer important bene-
ﬁts and enlisting companies to provide complementary goods.215 When
Nintendo ﬁrst introduced its game console in the U.S. market, for exam-
ple, it worked hard to ensure that it would be sold by vendors and used by
consumers?” Similarly, in today's video game marketplace, Microsoft,
Nintendo, and Sony are engaged in a heated competition in the video
game console market, spending nearly $1 billion in marketing over an
eighteen-month period.217 In short, a company that invents a new stan-
dard will often need to be willing to invest in the value of its network
(including the perception of it) ,2‘8 in some cases by adopting seemingly
unconventional strategies by giving portions of the product away for free
to lure users onto its platform.219 Similarly, where a ﬁrm sponsoring a
platform standard faces competition, it is likely to provide open access to
its platform in order to attract complementary products even without reg-
ulatory requirements that it do 50.220 Even if the competition among ri-
val standards ultimately converges to a single standard (as may occur at
some point with the rival cell phone standards), “going through an early
phase of extremely intense competition where each ﬁrm tries to build up
its network to get ahead of its rival” is likely to result in greater total net-
work penetration?21
Even where an incumbent company establishes an early lead and in-
stalled base of users, new entrants still will often ﬁnd a niche and be able
to enter the market. To be sure, switching costs will often limit the new
entrant’s ability to attract customers, but unless the economies of scale
give the incumbent an extraordinary cost advantage, the incumbent’s nat-
215. See Katz 8c Shapiro, Systems Competition, supra note 35, at 103 (noting that
network sponsor may need to make commitments regarding the availability of
complementary products to encourage adoption of its product).

216. See Rogers, supra note 163, at 246-50.

217. Chris Gaither, Video Game Field Becomes Crowded and Highly Proﬁtable, N.Y.
Times, Dec. 17, 2001, at C17.

218. As David Friedman put it, “Even where inventing a standard is not costly, making
it a standard may be." David Friedman, Standards as Intellectual Property: An Economic
Approach, 19 U. Dayton L. Rev. 1109, 1122 (1994).

219. Shapiro 8c Varian, Information Rules, supra note 152, at 273—74; Arthur, supra
note 162, at 105—06 (describing Novell's efforts to line up developers for its Netware
product).

220. See Farrell 8c Weiser, supra note 52, at 13—17 (describing incentives for such a
strategy); see also Gawer 8c Cusumano, supra note 45, at 51—52 (describing how Intel used
this approach).

221. Michael L. Katz 8c Carl Shapiro, Product Compatibility Choice in a Market with
Technological Progress, in Strategic Behaviour and Industrial Competition, I46, 164 (DJ.
Morris et al. eds., 1986) [hereinafter Katz 8: Shapiro, Product Compatibility]. The record-
breaking sales of the three major consoles—as well as the games manufactured for them—
suggest that the healthy rivalry in this market has a positive impact on total output. Seejim
Hu, Video Game Sales Set Record in 2001, CNET News.com, Feb. 7, 2002, at http:/ / news.
com.com/2100-1040—831599.htrnl (on ﬁle with the Columbia Law Rmiew).588 COLUMBIA LAW REVIEW [Vol. 103:534
ural tendency to exploit. its installed base will create openings for new
entrants.222 As Farrell and Shapiro explain, in many cases an incum-
bent’s marketing strategy will leave market segments underserved and
thereby actually invite entry?”
A second important reason why entrants often will have an opportu-
nity to introduce a rival standard is that incumbents confront what Clay-
ton Christensen calls the “innovator’s dilemma": They hesitate to intro-
duce new technologies that would “cannibalize” their existing product
offerings.224 This fear of cannibalization helps to explain why AT8cT de-
clined to use ﬁber optic technology for its long distance calls until Sprint
“made a pin drop," and why the Big Three auto companies failed to pro-
duce smaller cars until forced to do so to compete with the Japanese.225
Put differently, companies get locked in to a particular value network, so
that they are not able to innovate radically after establishing a platform
standard.226 Similarly, incumbent ﬁrms have a well-documented psycho-
logical propensity to rely on established ways of looking at their market
that leads them to misunderstand the opportunity for change through
radical innovations that would displace their old technologies?” Re-
gardless of the reason—a propensity to exploit their own installed base,
their fear of cannibalizing their existing products, or a commitment to
established perceptions—the failure of incumbents to introduce radical
innovations will often create an opening for a new entrant to introduce a
rival information platform.

222. See joseph Farrell & Carl Shapiro, Dynamic Competition with Switching Costs,
19 RAND]. Econ. 123. 127 (1988).

223. Id. at 128.

224. Clayton M. Christensen, The lnnovator's Dilemma 21 (1997). Christensen's
book follows a number of other commentators who articulated similar positions. See. e.g..
Scherer 8: Ross. supra note 190, at 653 (“[NJew entrants without a commitment to
accepted technologies have been responsible for a substantial share of the really
revolutionary new industrial products and processes"); Rebecca Henderson,
Underinvesttnent and Incompetence as Responses to Radical Innovation: Evidence from
the Photolithographic Alignment Equipment Industry, 24 RAND]. Econ. 248, 251, 267—68
(1993) (explaining how incumbents focus on incremental innovation whereas new
entrants are far more likely to undertake radical innovation); Rebecca M. Henderson 8c
Kim B. Clark. Architectural Innovation: The Reconﬁguration of Existing Product
Technologies and the Failure of Established Firms, 35 Admin. Sci. Q. 9, 9, 11 (1990)
(same).

225. See supra notes 195—198 and accompanying text.

226. As one commentator remarked with respect to IBM's ability to alter the basic
computer architecture that it introduced in its original PC, “the same forces that gave IBM
the power to create a standard in 1981 will impede" it from changing it. In particular,
given its promises of support and upward compatibility for its initial standard, IBM faced a
number of obstacles in considering the introduction of any breakthrough products.
Michael Hergert. Technical Standards and Competition in the Microcomputer Industry, in
Product Standardization and Competitive Strategy 67, 87 (H. Landis Cabel ed., 1987).

227. Henderson 8: Clark, supra note 224, at 17.2003] INTELLECTUAL PROPERTY POLICY 589
To establish a new standard or a rival to an existing one, a company
will often need to develop a “killer application,”228 or at least differentiate
its product from the incumbent?29 In the video game console market,
for example, Sega jumpstarted its new game console by developing and
introducing a Sonic the Hedgehog game made for its system, which helped
it to overcome Nintendo’s exclusive licensing practices that required de-
velopers to market their games solely for the Nintendo system?30 Moreo-
ver, Sega also beneﬁted from the cannibalization effect, as Nintendo
delayed its introduction of a more advanced product. In particular, even
though Nintendo had developed a sixteen-bit machine, it did not intro-
duce such machines (for fear that it would undercut the sale of its games
to its installed base) until Sega began to capture market share with its
sixteen-bit machine and games like Sonic?31 More recently, Microsoft in-
troduced the Xbox to challenge Sony’s leading console and is seeking to
build up a menu of attractive games to lure customers?” As a result of
standards competitions such as these, rival information platform sponsors
face added incentives to introduce enhanced features, attract new devel-
opers for complementary applications, and build up the installed base of
users?33
As suggested above in the cellular telephone example, standards
competitions often will enable consumers to beneﬁt from a more dy-
namic product market that includes more choices, enhanced products,
and lower prices. To be sure, a head start or an installed base from a
related technology is important to inﬂuencing the ultimate outcome of
such a battle, but, regardless of the outcome, it seems clear that competi-
tion to control the standard will push companies to develop superior
technology in the hope of establishing their preferred standard?34 Take,
for example, the case of the VHS-Beta battle for supremacy in the market
for videocassette recorders, where users enjoyed a rapid series of techno-
logical advances because both platform standards sought to improve
228. One classic example, which helped drive demand for new color televisions, was
RCA‘s use of Walt Disney’s Wonderful World of Color to attract viewers. See Carl Shapiro 8:
Hal R. Varian, The Art of Standards Wars, Cal. Mgmt. Rev., Winter 1999, at 8, 13
[hereinafter Shapiro 8c Varian, Standards Wars].

229. See Werden, supra note 155, at 91-93 (explaining that potential market entrant
must offer some “offsetting advantage”—such as lower price—to compete with
incumbent).

230. For a discussion of this episode, see Adam M. Brandenburger 8c Barry J.
Nalebuff, Co—opetition 237—41 (1996).

231. ld. at 239—42; Steven L. Kent, The Ultimate History of Video Games 407—08
(2001) (detailing some of Sega’s game development).

232. See Stephen H. Wildstrom, Xbox: It's All About the Games, Bus. Wk., Dec. 24,
2001, at 22, 22.

233. See Katz 8: Shapiro, Product Compatibility, supra note 22], at 148.

234. Shapiro 8c Varian, Standards Wars, supra note 228, at 11 (arguing that superior
technology can overcome a "ﬁrst mover advantage," provided that “the performance
advantage is signiﬁcant and users are not overly entrenched”).590 COLUMBIA LAW REVIEW [V0]. 103:534
upon their products in order to gain widespread acceptance.235 Of more
recent vintage, the video games market represents an instance where
three alternative platforms (Nintendo’s Gamecube, Sony’s PlayStation,
and Microsoft’s Xbox) continue to improve upon one another’s product,
even adding Internet access and other enhanced functionalities to their
consoles.”6 In fact, the video game console market’s now-ancient history
of the early Atari-Nintendo battles demonstrated how a rival network
product can capture market share by introducing “superior technology
and hot new games."237
A proactive commitment to a single platform standard facilitated
through intellectual property policy by allowing immediate access risks
entrenching a single standard and precluding valuable competition?”
In particular, by awarding all ﬁrms access to the initial standard at the
outset of a potential standards competition, rivals may well choose to take
advantage of the already developed standard as opposed to creating their
own.239 Put differently, new entrants would often have an easier time
competing within an open standard, but, if not able to pursue that course,
they are more likely to develop an alternative and innovative standard
than a dominant ﬁrm with an established one and an installed base of
users.240 Because individual ﬁrms are unlikely to develop alternative
technologies at the satne time, rival ﬁrm development ensures a certain
amount of experimentation in the marketplace?“ In sum, by encourag-
ing competition between rival platforms, intellectual property law can ad-
235. For an extended version of this history, see james Lardner, Fast Forward:
Hollywood, the Japanese. and the Onslaught of the VCR (1987); see also Anita M.
McGahan et a1., Creating Value and Setting Standards: The Lessons of Consumer
Electronics for Personal Digital Assistants, in Competing in the Age of Digital Convergence
227, 250 (David B. Yollie ed., 1997) ("Competition also led to the introduction of special
features on VHS.”); Michael I. Krauss. Regulation vs. Markets in the Development of
Standards, 3 S. Cal. Interdisc. L]. 781, 805 (1994) (arguing that VHS standard improved
due to challenge from Betamax).

236. See Michel Marriott, Let the Game Wars Begin, NY. Times, Apr. 26. 2001, at GI;
Eric]. Savitz, Big Game Hunting, Industry Standard, May 7, 2001, at 30, 33; David Becker,
Microsoft Trims Xbox Price, CNET News.com, May 15, 2000, at http://news.com.com,/
2100-1040-913832.html (on ﬁle with the Columbia Law Review); lan Fried, Microsoft Invests
Big to Put Xbox Online, CNET News.com, May 20, 2002, at http://news.com.com/2100-
1040817884.htm] (on ﬁle with the Columbia Law Review).

237. Shapiro 8c Varian. Standards Wars, supra note 228, at 18.

238. See Richard J. Gilbert, Symposium on Compatibility: Incentives and Market
Structure, 40]. Indus. Econ. l. 2 (1992) (“Standards limit flexibility to offer products with
specialized characteristics (standards limit product variety) and may constrain
technological progress by leading ﬁrms to suboptimal designs").

239. To be sure, regardless of the legal rules, rivals can still attempt to take the path 01'
cooperation over competition. but intellectual property policy can inﬂuence their
decisions by making one course more difﬁcult. For a discussion of competitive strategy
questions facing companies with regard to this issue, see Besen 8c Farrell, supra note 152,
at 117.

240. See Scherer, Innovation and Growth, supra note 189, at 108-09.

241. See joseph Farrell, Thoughts on Antitrust and Innovation, Address Before the
National Economists' Club 5 (Ian. 25, 2001). at http://www.usdqi.gov/atr/public/2003] INTELLECTUAL PROPERTY POLICY 59]
vance three critical goals: forcing companies to compete to build a valua-
ble customer base, requiring all companies to continue to enhance their
products and bring new ones to market more quickly for fear of being
displaced by a new killer application?” and driving companies to inno-
vate and develop superior technologies?“ By contrast, providing open
access to a single standard that would otherwise face viable platform com-
petition undermines the achievement of each of these beneﬁts.

2. Competition Within a Standard. — In the event that an information
platform owner dominates a market because alternative platforms cannot
reach or maintain the necessary critical mass, it will reap a great windfall.
For Schumpeterians, this result is acceptable on the ground that the great
bounty provided by controlling a proprietary standard may be a necessary
incentive to develop killer applications that can support a new platform.
On balance, however, it seems more likely that such unmitigated incen-
tives would overreward platform inventors by allowing them to thwart in-
novation (or reap exorbitant monopoly rents). Thus, when a platform
standard reaches or is headed for a dominant position in a market, intel-
lectual property protection against reverse engineering should recede.

Even where others can develop a product based on the same plat-
form standard, control of a dominant industry standard is “a license to
print money.”244 Arguments that the forced sharing of a dominant indus-
try standard would unduly undermine investment incentives deserve, as
Tim Bresnahan puts it, “a reality check.”“’45 After all, “[a] talented kid
can be quite motivated by rents in the low tens of millions, triﬂing as
speeches/7402.pdf (on ﬁle with the Columbia Law Review) (“ [S]ometimes diverse
approaches will be pursued only if there are multiple organizations involved”).

242. See Scherer, Innovation and Growth, supra note 189, at 125 (noting that
competition accelerates deployment date).

243. See Langlois, supra note 198, at 217 (obscuring that rival platforms afford “more
possible entry points for innovation” and the possibility of “experimenting with
organizational and design alternatives”).

244. Ferguson, supra note 25, at 280. As Ferguson elaborated:
If you control the standard, then you have advance knowledge of how it will
evolve and probably the deepest knowledge of how it works. You can therefore
develop the earliest and best products that depend upon it, while others are
reduced to trying to clone you, follow behind you, or serve minor niche markets.

Id. at 280—81 .

245. Bresnahan, supra note 6, at 192. A number of other commentators have
remarked that protecting dominant standards provides a windfall, not a necessary
economic incentive. See Langlois, supra note 198, at 222 (asserting that protecting a
standard through broad intellectual property protection creates a situation where “the
remuneration that monopoly rights confer far outstrip the risk-discounted ex ante costs of
innovation"); Lemley, lntemet Standardization, supra note 47, at 1060 n.64 ("[T]he
winners of standards competitions receive a windfall that is far greater than what
intellectual property normally gives as an incentive to invention."). in a sense, this
judgment reﬂects a relative assessment of the explanatory power of the Schumpeterian
hypothesis vis-a-vis the explanation provided by network economics. See Shelanski 8:
Sidak, supra note 173, at 6—7.592 COLUMBIA IAW REVIEW [V0]. 103:534
those may seem.”246 Thus, particularly where, as in the case of Microsoft,
a dominant ﬁrm abuses its control of an established standard to exclude
competition,247 the law should not hesitate to impose some form of
forced sharing requirement as to the intellectual (or real) property in
question.248
Stated in competition policy terms, the critical point is that facilitat-
ing access to rival platforms, even if anticipated before a ﬁrm invests in
innovation, will only dull—and not eradicate—the incentives to establish
an innovative platform standard.249 Put differently, economic theory sug-
gests that the rewards of establishing a de facto standard are well above
those necessary to motivate parties to champion and develop the stan-
dard in the ﬁrst place?“ That is, even without continued intellectual
property protection over the standard, the original inventor still will reap
considerable beneﬁts from her invention in the form of the ﬁrst mover,
installed base, and reputational advantages—all in addition to any mo-
nopoly rents accrued until the standard was opened.251 Thus, courts
should not wait too long before allowing access to a dominant proprietary
standard, lest the ﬁrm be able to extract excessive monopoly rents and
thwart future innovation.252
246. Bresnahan, supra note 6, at 192.

247. See United States v. Microsoft Corp., 253 F.3d 34, 64, 71, 74. 78 (2001).

248. See F .M. Scherer, Industrial Market Structure and Economic Performance
456—57 (2d ed. 1980) (“All in all. the substantial amount of evidence now available suggests
that compulsory patent licensing, judiciously conﬁned to cases in which patent-based
monopoly power has been abused . . . would have little or no adverse impact on the rate of
technological progress . . . ."); Scherer, Innovation and Growth, supra note 189, at 216
(ﬁnding "no signiﬁcant indication" that compulsory licensing in antitrust decrees led
parties to invest less in research and development);;see also Levin et al., supra note 145, at
804 (“The overall lack of impact from compulsory licensing requirements [in affected
industries] was consistent with Scherer's ﬁnding that they did not discourage R&D
spending").

249. See Posner, supra note 16, at 929 (positing that increased amount of available
rewards “should accelerate the rate of innovation, in just the same way that. other things
being equal, the more valuable a horde of buried treasure is, the more rapidly it will be
recovered“). The rhetoric of property law actually parallels this perspective, as it posits that
easements on an otherwise protected property right constitute a limitation that inheres in
the scope of the property right. See Rose. Comedy of the Commons. supra note 48. at
716—17.

250. Cf. Scherer, Antitrust, supra note 174, at 1016—17 (concluding that compulsory
licensing decree imposed on Xerox did not stall its research and development, but instead
facilitated innovation by enabling others to improve the technology developed by Xerox);
id. at 1018 (“[A] massive antitrust attack on business ﬁrms' use of patents to monopolize
markets or enhance proﬁt retums appears to have had negligible adverse consequences
for the vigor of innovative activity in the United States”).

251. See Porter, supra note 188, at 788 n.61 (explaining how ﬁrst mover advantages
can bring considerable rents to a ﬁrm, even where competitors soon enter a market).

252. See Langlois, supra note 198, at 221 (“The owner of a dominant standard may
thus want to manipulate the standard in ways that close off the possibilities for a
competitor to achieve compatibility. This has a tendency to retard the generational
advance of the system"): Barnett, supra note 34, at 992 ("Absent signiﬁcant entry threats.2003] INTELLECTUAL PROPERTY POLICY 593
Intellectual property law should insist on several preconditions
before concluding that a company's proprietary control of an informa-
tion platform threatens full and fair competition and requires corrective
action (in the form of permitting reverse engineering of a proprietary
standard). First, to the extent that it seems clear that a company lacks
market power, it should be permitted to enforce its intellectual property
rights to prevent horizontal access.253 A lack of market power can be
shown by recent entry and swings in market share, both of which can
demonstrate that the tipping phenomenon has yet to—or will not—kick
in. Second, the law needs to recognize the value of allowing competition
to proceed in developing platform markets. In particular, because rival
platform standards compete to attract users and press to develop a supe»
rior product, even where one standard ultimately emerges as dominant,
some initial experimentation may well result in a better standard.

Finally, if it seems clear that a single standard will emerge as domi-
nant, the law should facilitate competition within—as opposed to for—the
platform standard by allowing horizontal access. In so doing, it not only
is calibrating investment incentives (to avoid awarding an unnecessary
windfall for innovation), but also is ensuring continued innovation in a
market where a single ﬁrm controls the basic platform standard. This
approach, to be sure, raises the question of how to judge whether a ﬁrm’s
incumbent firms may face serious disincentives to exploit intensively [their] intellectual
property holdings and sustain signiﬁcant levels of fundamental innovation”); id. at 1026
(“If a large frrrn has a dominant market share and faces few potential entrants, it may be
reluctant to undertake or accelerate development projects that may generate radical
innovations that could cannibalize the existing profrt stream of current projects").
AT&T's actions in the equipment and long distance markets remain the quintessential case
in point. See United States v. AT8cT Co., 552 F. Supp. 131, 222—23 (D.D.C. 1982), aﬁ‘d sub
nom. Maryland v. United States, 460 US. 1001 (1983). See generally Steve Coll, The Deal
of the Century: The Breakup of AT&T (1986) (describing history and aftermath of
antitrust litigation against AT8cT). Related to ATBcT’s dominance of these markets was its
drinking about the deployment of ﬁber optic technology. As one industry executive
related it:
AT&:T, which owned most of the telephone lines in America at the time [of
the invention of ﬁber optic technology]. said it would be 30 years before its
telephone system would be ready for optical ﬁber. And when it was, AT8cT
planned to make its own ﬁber. . . .

[After AT8cT entered into a consent decree,] MCI took the risk [of ordering
ﬁber optic technology] and placed a 100,000 kilometer order for a new
generation of ﬁber . . . .

Telecommunications: The Role of the Department ofjustice: Hearing Before the House
Committee on the Judiciary, 104th Cong. 125—26 (1995) (prepared statement of Timothy
j. Regan, Division Vice President and Director of Public Policy, Corning, Inc.).

253. See Dep't of justice and Fed. Trade Comm'n Antitrust Guidelines for
Collaborations Among Competitors 26 (2000), reprinted in 4 Trade Reg. Rep. (CCH) 1
13161 (2000) (providing safe harbor for ventures with less than twenty percent market
share); see also Northwest Wholesale Stationers, Inc. v. Pac. Stationery 8c Printing Co., 472
U.S. 284, 296—97 (1985) (holding that access to joint venture only raises antitrust concern
where venture has market power or access to the facility is essential to competition).594 COLUMBIA LAW REVIEW [Vol. 103:534
control of a user interface or a platform standard will enable it to estab-
lish dominance, but, as discussed further in Part V, such predictive judg—
ments are reasonably well developed in antitrust law. In the case of de-
fending against using another ﬁrm’s platform standard, the relevant test
would be along the lines of the antitrust standard used in evaluating a
proposed merger—in particular, whether a firm’s dominance would be
entrenched without allowing access to the standard at issue. To take the
case of ReaINetworks’s use of reverse engineering to gain access to
Microsoft's Windows Media Player standard, the relevant question is
whether, but for the reverse engineering used to gain access to
Microsoft’s standard, there is a substantial likelihood that Microsoft will
emerge as a monopoly in the market for media players.254
B. The Competitive Platforms Model, the Role of Standard-Setting Bodies, and
Government Funding of Research and Development
The competitive platforms model provides an alternative guide for
Internet policy and intellectual property law to that offered by either the
proprietary control or commons theories. In particular, it aims to inte-
grate an economic theory about how platform markets develop with the
tools offered by intellectual property policy. With respect to the In-
ternet’s application layer—be it a Web browser, media player, or other
invention that supports the viewing of or access to content—intellectual
property law may well prove an effective regulator of access to platform
standards and ensure that a firm does not wield monopoly control over a
proprietary standard. With respect to the Intemet’s most basic standards
contained in its logical layer, however, their public goods quality and
open nature mean that they may not be susceptible to proprietary devel-
opment.255 To assist in the maintenance and development of such stan-
dards, both standard-setting bodies and government support are likely to
prove to be the more signiﬁcant and effective regulators (as opposed to
intellectual property law) in ensuring that the Internet’s logical standards
(and ones similar to it) can evolve over time.

Most legal commentators have failed to appreciate the essential role
played by standard-setting bodies in developing the rules of the road for
the Internet and the information economy. Standard-setting bodies
254. It is important to note in this regard that a company need not control one
hundred percent of a market to be considered a monopolist; rather, being a monopolist
merely connotes that a company possesses a considerable degree of control over prices and
output (or the ability to exclude competitors). See United States v. E.l. du Pont de
Nemours 8c (30.. 351 U.S. 377. 391 (1956) (deﬁning "monopoly power" as “power to
control prices or exclude competition"). For a discussion of monopoly power and when a
firm is a monopolist, see Richard A. Posner. Antitrust Law 195—96 (2d ed. 2001) (noting,
among other things, that courts often use market shares of ﬁfty to seventy percent as
threshold indicators of when a ﬁrm is a monopolist); see also Am. Bar Ass'n, Section of
Antitrust Law, I Antitrust Law Developments 235—36 (4th ed. 1997) (noting the ﬁfty and
seventy percent benchmarks and citing supporting federal case law).

255. See supra note 34 and accompanying text.2003] INTELLECTUAL PROPERTY POLICY 595
range from those operating under the auspices of government agencies
to independent organizations like the W30 or IETF, to industry consortia
focused on a single standard.256 By providing a forum for communica-
tion, standard-setting bodies serve an important management and coordi-
nating role, but their lack of formal legal authority underscores why they
are best seen as a tool for implementing government policy and not a
substitute for government policymaking.257 Over the course of the In-
temet’s development, a number of standard-setting bodies—in particu-
lar, the IETF and the WSC—have played essential roles in developing and
pushing the deployment of Intemet—related standards.

As an example of the potential importance of standard-setting com-
mittees for the Intemet’s future development, consider the case of Web
services. The category of developments labeled collectively as “Web ser-
vices” describes a set of Intemet-related initiatives designed to transform
the development, use, and distribution of software programs by enabling
them to access different components from remote locations.258 These
initiatives were championed in and developed by the W3C standard—set-
ting body. Based on these initiatives, companies like Dollar Rent A Car
were able to rely on a Web service connection to Southwest Airlines that
allows passengers to reserve a Dollar rental car through Southwest’s on-
line reservation system.259 Not only was this service easier to develop as a
Web service—it took only two months using the Web services technology
as opposed to the eight months it would have taken to develop a proprie-
256. The ongoing effort to manage the standard for digital television reﬂects one
example of government standard setting outside of the Internet context. See Wallman,
supra note 212, at 243—46. The patent pool used for the development of the MPEG-2
standard used for DVDs is an example of an industry consortium. See Willard K. Tom 8c
joshua A. Newberg, Antitrust and Intellectual Property: From Separate Spheres to Uniﬁed
Field, 66 Antitrust LJ. 167, 219—21 (1997).

257. Kevin Werbach's observation, made in regard to the IETF, is worth noting:
The legal authority of any of these bodies is unclear. Most of the underlying
architecture of the Internet was developed under the auspices, directly or
indirectly, of the United States government. The government has not, however,
deﬁned whether it retains authority over Internet management functions, or
whether these responsibilities have been delegated to the private sector. The
degree to which any existing body can lay claim to representing “the Internet
community" is also unclear.
Kevin Werbach, Fed. Communications Comm'n, Digital Tornado: The Internet and
Telecommunications Policy 20 (Off. Plans 8: Pol'y, Working Paper No. 29, 1997), available
at http://www.fcc.gov/Bureaus/OPP/working_papers/oppwp29.pdf (on ﬁle with the
Columbia Law Review). For a critique of the use of nongovernmental bodies such as ICAN N
to make government policy, see Froomkin, supra note 34, at 165-71. For a discussion of
how standard-setting bodies can be used to implement government policy, see Weiser,
Internet Governance, supra note 3, at 825—32.

258. See Erick Schonfeld, What The *&%@!l Are Web Services? (And Why You
Should Care.), Business 2.0, Feb. 18, 2002, available at http://www.business2.com/
articles/web/print/O,1650,38028,FF.html (on ﬁle with the Columbia Law Review).

259. See Wylie Wong, Pitch: Why Web Services Make Business Sense, CNET
News.com, Nov. 8, 2001, at http://news.com.com/2009-1017-275442.html (on ﬁle with the
Columbia Law Rat/inn).596 COLUMBIA LAW REVIEW [Vol. 103:534
tary system from scratch—but it also can easily be duplicated for other
airline partners using the open and common protocols.260 Like the In-
ternet itself, this model of software development places a premium on
interoperability between certain basic standards that would be adopted by
a community of developers, and thus requires a continuing commitment
to a common standard?“
As currently envisioned, Web services will rely on a set of standards
associated with the W3C’s Extensible Markup Language (XML),2‘32 which
is designed to facilitate electronic commerce by enabling the use of elec—
tronic “tags” that will make “it signiﬁcantly easier for organizations and
individuals to identify, integrate, and process complex information that.
may initially be widely dispersed among systems and organizations."2“-" In
its new .NET initiative, Microsoft has embraced the open XML standard
and, in its own words, is committed to allowing “applications to share
information via the Internet, regardless of the operating system or back-
end software that the application is using."‘-’“4 To be sure, it remains to
be seen whether Microsoft will adhere to a nonproprietary strategy with
respect to the XML standard (and its past actions offer good reasons for
skepticism on this scorez‘i"), btrt its rhetoric and actions thus far are quite
260. Id.

261. As Mark Lemley pttt it, "the optimal number of ‘Internets' in a free market
economy is one.” Lemley, Internet Standardization. supra note 47, at 1045.

262. For an explanation of XML and its development process. see Norman Walsh. A
Technical Introduction to XML, xml.com. Oct. 3, l998, at lrttp:,/',I'mw.xml.com_/"pub/aI"
98/ lO/guide0.html (on ﬁle with the Columbia Law Rmiau); World Wide Web Consortium,
Extensible Markup Language (XML) Activity Statement, at http:/,I’wwww3.org/XML/
Activity (last modiﬁed Jan. 15, 2003) (on ﬁle with the Columbia Law leiew). A second key
standard associated with Web services is the Simple Object Access Protocol (SOAP). which,
using XML, is designed to allow businesses to connect their computing systems over the
Internet. See Paul Festa, Critics Clarnor for Web Services Standards. CNET News.corn,
Feb. 12. 2002, at http://news.corn.com/2l()0—I(.)23—834990.html (on ﬁle with the Columbia
Law Review). Two additional related standards are Universal Description, Discovery, and
Integration (UDDI) and Web Services Description Language (WSDL). The interaction of
the four standards can be understood by analogy to a telephone call: *XML represents the
conversation, SOAP describes the rtrles for how to call someone. and UDDI is the phone
book. WSDL describes what the phone call is about and lrow yotr can participate."
Margaret Kane. Player's: Start-ups May Get Window to Fill Gaps, CNET News.com, Nov. 8.
2001, at http:/ / news.com.conr/ 2009-1017-275443thml (on ﬁle with the Columbia Law
Review) [hereinafter Kane. Players].

263. Gen. Accounting Ofﬁce, Electronic Government: Challenges to Effective
Adoption of the Extensible Markup Language 3 (Apr. 2002), available at http:/,."
www.gao.gov/new.items/d02327.pdf (on ﬁle with the Columbia Law Review). For a general
discussion of XML, see Douglas E. Phillips, XML Schemas and Computer Language
Copyright: Filling in the Blanks in Blank Esperanto, 9]. Intell. Prop. L. 63, 64—72 (2001).

264. Microsoft Corp., Microsoft.NET: What Are XML Web Services? (Ian. 14, 2002),
at http://www.microsoft.com/net/basics/xmlservicesasp (on ﬁle with the Columbia Law
Rtuiew).

265. Part of the incentive to proprietize a common standard is that the common
standard invites entry and innovation from outside players. See Kane, Players, supra note
262 (noting how Web services facilitate new entry).2003] INTELLECTUAL PROPERTY POLICY 597
promising.266 Only time will tell whether this effort will succeed, as main-
taining a common standard in the face of pressures to move more quickly
or in different directions—even if not motivated by a desire to “embrace,
extend, and extinguish” a standard used by rivals257—is notoriously difﬁ-
cult.268 One reason for optimism, though, is that there is a strong incen-
tive for parties to commit to open platforms where such commitment can
266. Lawrence Lessig, for example, testiﬁed to this very point. See The Microsoft
Settlement: A Look to the Future: Hearings Before the Senate Comm. on the Judiciary,
107th Cong. 2 (2001) (statement of Lawrence Lessig, Professor, Stanford Iaw School),
available at http://judiciary.senate.gov/print_testimony.cfm?id=1358cwit_id=104 (on ﬁle
with the Columbia Law Review) (stating that Microsoft .NET could become an important
force in preserving innovation). It is noteworthy that, even if Microsoft supports XML as
an open and common standard, it could still reap great proﬁts through other .NET
initiatives, such as its “.NET My Services” effort to set itself up as a crucial—and
proprietary—intermediary for e-commerce transactions. See generally Alec Klein,
Planting the Seeds, Wash. Post, july 1, 2001, at HI (describing .NET initiative);]im Hu,
Competition: Ultimate Challenge to AOL, CNET News.com, Oct. 19, 2001, at http://
news.com.com/2009-1001-273801.htmIPIegacy-cnet (on ﬁle with the Columbia Law Review)
[hereinafter I-Iu, Competition] (describing .NET My Services effort as “designed to
organize all manners of personal information, from calendars to credit card numbers,
while easing such online transactions as banking and shopping"). There are at least two
forces, however, that mitigate against this concern. First, the marketplace appears to be
reluctant to embrace Microsoft’s strategy, leading Microsoft to backpedal on this initiative.
See john Markoff, Microsoft Has Quietly Shelved Its lntemet “Persona” Service. N.Y.
Times, Apr. 11, 2002, at C] (noting customer resistance to service). Second, and not
surprisingly, there are alternatives to Microsoft’s effort, though important questions
remain as to whether they will pose a real threat to Microsoft. See Hu, Competition, supra
(noting that AOL has developed a similar service called “Screen Name Service”); Stephen
Shankland, Open Source Steps in to Duplicate .NET, CNET News.com, July 9, 2001, at.
http://news.com.com/2100-1001-269665.html (on ﬁle with the Columbia Law Review)
(noting the development of an open source alternative).

267. Dan Goodin, Microsoft, Intel Wage War of Words, CNET News.com, Nov. I2.
1998, at http://news.com.com/2102-1023—217848.html (on ﬁle with the Columbia Law
Review) (quoting Intel executive testifying at Microsoft trial as to Microsoft's alleged self-
proclaimed strategy). Sun Microsystems has already challenged Microsoft's .NET efforts as
anticompetitive, ﬁling a private antitrust suit requesting that the .NET initiative be
“decoupled” from Microsoft's Windows operating system. See Stephen Shankland, Sun
Brings Antitrust Suit Against Microsoft, CNET News.com, Mar. 8, 2002, at http://
news.com.com/ 2100-1001-855696.html (on ﬁle with the Columbia Law Review). In
testifying on behalf of the nine states that opposed the terms of the govemment’s
settlement with Microsoft, a Sun executive explained how Web services could be a
“substantial, viable threat to Windows'" because they could work with Windows on the
desktop, the historic source of Microsoft's monopoly. See Joe Wilcox, Sun: Microsoft
Worried over Web Services, CNET News.com, Apr. 9, 2002, at http://news.com.com/2100-
1001-879012.html (on file with the Columbia Law Review). As Carl Shapiro and Hal Varian
have explained, “[o]pen standards can . . . be ‘hijacked’ by companies seeking to extend
them in proprietary directions, and thus in time gain control over the installed base.”
Shapiro 8c Varian, Information Rules, supra note 152, at 257.

268. The challenge for the W3C is to work with individual company or consortium
initiatives without allowing those efforts to derail or fragment the common standard. See
Festa, supra note 262 (noting criticisms of the W3C's progress and detailing the
establishment of a “Web Services Interoperability Organization" to prod the W3C).598 COLUMBIA LAW REVIEW [VoI. 1032534
facilitate the development of a strong complementary market and ensure
that the market develops.269
For initiatives—like the development of the XML standard—that re-
present an upgrade to the Internet’s architecture and will facilitate a
greater reliance on the Internet, there is a vital role for direct govern-
ment support of the basic research and development that will upgrade
the logical infrastructure of the Internet. This support can come in sev-
eral forms, most notably by sponsoring the basic research of academics
(or other disinterested parties).2'70 Indeed, the government’s use of this
strategy in the 19605 and 19705 supported the work of a number of re-
search institutions that played a critical role in developing key Internet
technologies?"
The evidence is mixed as to whether the government appreciates the
importance of its ability to push the development of new basic standards
and the development of an advanced information infrastructure, particu-
larly as to the Internet’s logical standards. Because it both funds research
and is an important consumer of information technology,272 the govern-
ment can play an active and effective role in supporting the development
269. See Larry Dignan, Web Services: Ready. Set, Wait, CNET News.com, june 18,
2002. at http://news.com.com/2100-1001-936941.hlml (on ﬁle with the Columbia Law
Review) (noting the slow rates of adoption in the absence of well developed common
standards); see also Farrell 8c Weiser, supra note 52, at 12—22 (explaining incentives for
parties to develop open architectures);_]im Hu, Cries to Open up IM Have Quieted, CNET
News.com, May 13, 2002, at http://news.com.com/2100-1023-911820.html (on ﬁle with
the Columbia Law Review) (“[D]eveloping common standards [for instant messaging] is a
necessary step to creating the first real revenue-making opportunities for [instant
messaging].").

270. See N11 2000 Steering Comm., Nat‘l Research Council, The Unpredictable
Certainty: Information Infrastructure Through 2000, at 23 (1996). available at http://
www.books.nap.edu/books/030905432X/htrnI/index.htrnl (on ﬁle with the Columbia Law
Review) (explaining call for increased funding of research and development as “one of the
most effective mechanisms" for the federal government to “enable more capabilities,
greater ease of use, and lower cost for different components of the information
infrastructure”); President's Info. Tech. Advisory Comm.. Information Technology
Research: Investing in Our Future 1 (Feb. 1999), available at http://www.ccic.gov/ac/
report/pitac_report.pdf (on ﬁle with the Columbia Law Review) [hereinafter Investing in
Our Future] (“Research programs intended to maintain the flow of new ideas in
information technology and to train the next generation of researchers are funding only a
small fraction of the research that is needed, turning away large numbers of excellent
proposals”); cf. Suzanne Scotchmer, Standing on the Shoulders of Giants: Cumulative
Research and the Patent Law,]. Econ. Persp., Winter 1991, at 29, 40 (observing that the
minimal prospects of ﬁne tuning the patent system to achieve an optimal competition
policy “may be an argument for more public sponsorship of basic research”). For a list of
recommendations related to government support for the information infrastructure, see
Investing in Our Future, supra. at 40—46.

271. See Abbate, supra note 7, at 36—37.
272. Margaret Kane, Government Seeks Accord on XML, CNET News.com,_]une 12.
2002, at http://news.com.com/2]00-1001-935223.html (on ﬁle with the Columbia Law
Review) (“[T]he federal government is easily the largest consumer of computer hardware,
software and services on the planet.").2003] INTELLECTUAL PROPERTY POLICY 599
of new basic standards.273 In the case of the development of the TCP/IP
standard, for example, the Defense Department played a critical role by
not only pushing its contractors to adopt this standard, but also subsi-
dizing users to invest the time and money to make the necessary up-
grades.274 In moving to support a compatible implementation of XML,
the government has taken an important step in supporting basic stan-
dards, but it should adopt a more systematic approach to facilitating their
adoption?75 Without the govemment’s ﬁnancial support for collective
action efforts involving lots of Internet players—such as upgrading the
Internet’s addressing system or ensuring that the Internet works in a se-
cure fashion—it will be difﬁcult for the private sector alone (even with
enlightened thinking and the coordination of standard-setting bodies) to
spearhead such efforts.276 Moreover, with the govemment’s declining in-
273. See Gen. Accounting Office, supra note 263, at 50—51 (noting successful
government coordination and engagement with standard-setting bodies); Steve Lohr, Go
To 45 (2001) (noting that the government used its spending on information technology to
support the COBOL language in the 19605). With respect to Web services and the
emerging set of standards associated with XML, there is an important opportunity for the
federal government to itself agree on certain speciﬁcations and to champion their cause
within standard-setting bodies and the marketplace. See Gen. Accounting Ofﬁce, supra
note 263, at 5, 7, 47, 51, 60 (calling for the government to adopt a uniﬁed strategy and to
be more active at the relevant standard-setting committees); Margaret Kane, Government
Urges Slow Road to XML, CNET News.com, Apr. 8, 2002, at http:/ / news.com.com/ 2100-
I001-877795.html (on ﬁle with the Columbia Law Review) [hereinafter Kane, Slow Road]
(reporting on GAO conclusions).

274. See Abbate, supra note 7, at 140—42 (discussing government pressure on
contractors); id. at 188 (discussing funding for upgrades). The government also can
facilitate technological transitions in its role as a regulator. For a discussion of such an
effort with regard to the transition from analog to digital television, see Albert N. Lung,
Note, Must-Carry Rules in the Transition to Digital Television: A Delicate Constitutional
Balance, 22 Cardozo L. Rev. 151, 158-95 (2000).

275. Paul Festa, Web Group Pushes XML Testing, CNET News.com,June I2, 2002, at
http://news.com.com/2I00-1001-935405.html (on ﬁle with the Columbia Law Review)
(noting that government's National Institute of Standards and Technology provided ﬁrst
foundation for testing suite for XML); Kane, Slow Road, supra note I73 (outlining
government approach to the issue and noting proposal to promote interagency
collaboration on standards).

276. For a discussion of the need for and the challenge of adding more Internet
addresses, see Sam Ames, Europe Sees Net Running out of Room, CNET News.com, Feb.
21, 2002, at http://news.com.com/2I 001033842718.htm (on ﬁle with the Columbia Law
Review); see also William Jackson, Clarke Stumps for Net Security Center, GCN, Oct. 21,
2002, at http://www.gcn.com/2l_31/news/2030]-I.htrnl (on ﬁle with the Columbia Law
Review) (calling for U.S. government involvement in transition). For a discussion of the
security issues raised by the Internet’s core protocols, see Brian Krebs, White House
Sounds Call for New Internet Standards, washingtonpost.com, July 30, 2002, at http://
www.washingtonpost.com/ac2/wp-dyn/A22535-2002Jul30 (on ﬁle with the Columbia Law
Review). One area where government has provided some support is in the development of
the so-called “Intemet2' initiative, which aims to support, among other things, research
focused on quality of service improvements. See Aliza Eamshaw, What Will the Next
Generation of the Internet Bring?, Denver Bus. J., Jan. I8—24, 2002, at B7.600 COLUMBIA LAW REVIEW [Vol. 103:534
vestment in basic research,277 the private sector is not likely to pick up the
slack on funding important projects that could lead to long-run social
beneﬁts?" Fortunately, some governmental officials appreciate the ra-
tionale for government involvement in and support for the collective in-
terests of the lntemet community, and have proposed, for example, a
resumption of support for the IETF.27‘-’
V. TOWARD A COMPETITIVE PLATFORMS CONCEPTION OF THE LEGALIW OF
REVERSE ENGINEERING
This Part proposes a new framework for evaluating the legality of
reverse engineering efforts based on the competitive platforms model.
Under intellectual property law, the permissibility of copying user inter-
faces and using reverse engineering to gain access to a platform standard
holds great promise as a lever to implement the balance struck by the
competitive platforms model. Unlike antitrust or telecommunications
regulation, a well-crafted intellectual property regime offers a self-help
option by allowing the copying of user interfaces and the use of reverse
engineering to gain access to a platform standard to facilitate competi-
tion where a ﬁrm is otherwise likely to dominate that market. Similarly,
intellectual property law should resist allowing the copying of a user inter-
face or allowing access to a platform standard where competition is other-
wise sustainable in that market. Signiﬁcantly, intellectual property law,
unlike government funding and standard-setting bodies, is not a helpful
tool to address the need to support common standards, such as those that
comprise the Internet's logical layer. But for inventions at the Internet’s
applications layer, intellectual property law will play an important role in
regulating the nature of competition and facilitating innovation.

As discussed below, the current state of intellectual property law fails
to implement any coherent competition policy, let alone the approach
suggested by the competitive platforms model. To highlight the recom-
mended change in direction, sections A and B examine two inﬂuential
277. See Mark Chediak, Funding Research and Development, Red Herring, Nov.
2001. at 28, 28 (noting that government’s support of research and development spending
went from 65% in 1960 to 26% in 2000 and industry’s rose from 33% to 68%); Investing in
Our Future, supra note 270, at 3 (“Measured in constant (non-inﬂated) dollars, support in
most critical areas has been ﬂat or declining for nearly a decade, while the importance of
information technology to our economy has increased dramatically”).

278. See Frischmann, supra note 200, at 371—72 (explaining this phenomenon). For
calls for the govemment to support such efforts in the Internet context, see Investing in
Our Future, supra note 270, at 7 (“We cannot rely on industry to fund the needed research
because they necessarily focus, in view of economic realities, on the short term. Industry
cannot and will not invest in solving problems of importance to society as a whole unless
such investments make sense from a business perspective"); Internet's Coming of Age,
supra note 24, at 21 (calling on the government to provide such funding).

279. See William Jackson, U.S. Should Fund R8cD for Secure lntemet Protocols,
Clarke Says, GCN, Oct. 31, 2002, at http://www.gcn.com/vol1_noI/daily—updates/20382-
I.html (on ﬁle with the Columbia Law Rtm'ew).2003] INT ELIECTUAL PROPERTY POLICY 601
cases that dealt with the issue of access to platform standards and user
interfaces, Sony Computer Entertainment, Inc. v. Connectix €041.28" and Lotus
Development C011). 1). Borland International, Inc. 281 Although Connectix failed
to appreciate the role of intellectual property in implementing competi-
tion policy, the Lotus case (or, more precisely, Judge Boudin’s concurring
opinion) did so effectively.282 Finally, section C evaluates potential objec—
tions to the suggested role for intellectual property law outlined in this
Part.

A. The Challenge of Converging Platforms and Connectix
As discussed brieﬂy in Part I, Connectix represented the ﬁrst major
case to raise a horizontal access claim. In that case, Connectix used re-
verse engineering, including some intermediate copying of Sony’s PlayS-
tation video game console’s BIOS (basic input-output system), to develop
a new software program called the “Virtual Game Station” or “VGS.” This
new platform enabled consumers to use Connectix’s product to play on
their computers games made for Sony’s PlayStation.283
The Ninth Circuit analyzed Sony’s challenge to Connectix’s use of its
copyrighted product under the fair use standard set forth in its earlier
decision, Sega Enterprises Ltd. v. Accolade, Inc.284 In Sega, the court held
that intermediate copying of a program to gain access to its functional
elements—as part of a reverse engineering process—constitutes a fair use
under copyright when such use is “necessary” to gain access to the func-
tional elements of the copyright itself.285 Although Sega did not expressly
distinguish between horizontal and vertical access, it did recognize a criti-
cal distinction between the two in asking whether the alleged infringer’s
product would satisfy demand for the protected work.286 Moreover, the
Supreme Court’s subsequent decision in Campbell 1). Acuﬂ-Rose Music, Inc.

280. 203 F.3d 596 (9th Cir. 2000).

281. 49 F.3d 807 (lst Cir. 1995), aff‘d by an equally divided Court, 516 US. 233
(1996).

282. Although these cases arise in the context of copyright infringement, the
approach urged for regulating the permissibility of reverse engineering should also be
implemented in the patent context in light of the increased patenting of computer
software. In theory, it should be unnecessary to copy the protected work in order to
reverse engineer patented software, as the Patent Act requires disclosure as a prerequisite
to gaining protection. See 35 U.S.C. § 112 (2000). With respect to software patents,
however, neither caselaw nor the Patent and Trademark Office regulations requires the
disclosure of the actual source code. See N. Telecom, Inc. v. Datapoint Corp., 908 F.2d
931, 941—43 (Fed. Cir. 1990) (holding that a code listing is not necessary if a programmer
of reasonable skill could write a satisfactory program with an ordinary effort): Submission
of Computer Program Listings, 37 C.F.R. § 1.96 (2002).

283. The relevant facts of the case are set out in the Circuit Court's opinion. See
Connectix, 203 F.3d at 598—99.

284. 977 F.2d 1510 (9th Cir. 1992).

285. Id. at 1527-28.

286. Id. at 1523. Technically, this consideration falls within the fourth, and most
important, fair use factor—the effect on the potential market. See 17 U.S.C. § 107(4)602 COLUMBIA LAW REVIEW [Vol. 103:534
suggested that the fair use analysis should take a more nuanced analysis
by evaluating whether the use of copyrighted material serves a “trans-
formative” (and therefore permissible) or a “substitutive” (and therefore
impermissible) purpose.287 The Connectix court, in an attempt to harmo-
nize Sega and Campbell, concluded that the Virtual Game Station was
“modestly transformative” because it constituted a “wholly new product,
notwithstanding the similarity of uses and functions between the Sony
PlayStation and the Virtual Game Station."285 In so doing, it failed to
distinguish between cases like Sega, where the provider of the application
designed a complementary product, and those like Connectix, where the
purpose of interoperability was to compete with the underlying informa-
tion platform?”
Under the competitive platforms model for regulating access to in-
formation platforms, the Ninth Circuit should have accepted Sony's claim
of infringement. In particular, the court should have looked more
closely at whether the markets for video games and computing were in
fact converging, such that VGS’s product would compete with Sony's.29"
Because there are important signs that this was the case (as recognized in
the district court’s opinion, for example29'), the next question would be
(2000); Stewart v. Abend, 495 U.S. 207, 238 (1990); Harper 8c Row, Publishers, Inc. \-'.
Nation Enters, 471 US. 539. 566 (1985). In his Sega opinion,_]udge Reinhardt explained:
There is no basis for assuming that Accolade's “lshido” has significantly affected
the market for Sega‘s “Altered Beast," since a consumer might easily purchase
both; nor does it seem unlikely that a consumer particularly interested in sports
might purchase both Accolade‘s “Mike Ditka Power Football" and Sega's “ 0e
Montana Football.” particularly if the games are. as Accolade contends, not
substantially similar.

Sega Enters, 977 F.2d at 1523. Similarly, in Lewis Galoab Toys, the Ninth Circuit concluded
that the complementary nature of the work counseled against holding it to be an
infringing work. See Lewis Galoob Toys, Inc. v. Nintendo of Am., Inc. 964 F.2d 965, 969
(9th Cir. 1992) (“The Game Genie is useless by itself, it can only enhance, and cannot
duplicate or recast. a Nintendo game's output").

287. 510 US. 569, 579—80, 598—99 (1994).

288. (ion-neclix, 203 F.3d at 606; see also id. at 606—07 (“We are therefore at a loss to
see how Connectix's drafting of entirely new object code for its [Virtual Game Station]
program could not be transformative. despite the similarities in function and screen
output.“).

289. See lvan Rothman, From Sega to Sony and Beyond: An Alternative Legal Basis
For Software Reverse Engineering, lntell. Prop. L. Newsl. (Am. Bar Ass'n Section on
Intellectual Prop. Law, Chicago, 111.), Spring 2000, at 1, 5 (noting that “unlike Accolade,
Connectix did not develop software games compatible with Sony's platform, but an
alternative platform compatible with" games made for Sony's platform).

290. By contrast, the court in Midway Mfg. Co. v. Artie lnt'l, Inc. made this very
judgment, concluding that the copying necessary to produce a “speed-up" chip that would
replace a portion of a copyrighted program did not constitute an acceptable use. See 704
F.2d 1009, 1013 (7th Cir. 1983).

291. Sony Computer Entm't, Inc. v. (Jonnectix Corp., 48 F. Supp. 2d 1212, 1221 (NO.
Cal. 1999) (“Sony is being harmed by the sales of Connectix's emulator. . . . To the extent
an individual purchases a VGS to play PlayStation games, those consumers [sic] will be less
likely to buy PlayStation consoles."); see Sony Computer Entm‘t, Inc. v. Bleem, 214 F.3d2003] INTELLECTUAL PROPERTY POLICY 603
whether Sony enjoyed sufﬁcient market dominance to justify access to its
platform to create a rival one along the lines of the VGS. Given
Microsoft’s recent entry into this market, and the continued strength of
Nintendo, it seems that no such access is necessary,292 and thus Connec-
tix’s copying should not have been judged a fair use. Finally, if Connectix
had engaged in the reverse engineering of a dominant standard, it
should also have been required to show that it did not merely clone
Sony’s product, but added some value to it. The Ninth Circuit may have
had this criteria in mind when it determined that Connectix's product
was “modestly transformative,” but this conclusory language should not
substitute for the relevant market analysis.

The Connectix precedent threatens to allow horizontal access in con-
texts where so doing will undermine important investment incentives. In
particular, VGS’s use of Sony’s innovation without permission—by creat-
ing a product that relied on the established brand strength and set of
complements—enabled it to appropriate the beneﬁts of Sony’s invest-
ments in a competitive market that will limit Sony’s return on them.“’93 If
this precedent is followed and upheld, intellectual property law will not
protect companies whose nondominant innovations are copied and re-
sold in a related form that avoids signiﬁcant research and development,
marketing, and other key investments. To be sure, it is important that
courts do not simply take a company’s opposition to reverse engineering
as sufﬁcient to condemn an alleged use as infringing,294 but the Connectix
court did not even begin to formulate an analysis that evaluated the rele-
vant incentives created by its decision.295
1022, 1027 (9th Cir. 2000) (ﬁnding it “manifestly clear” that an emulator competed
directly with the Sony PlayStation console).

292. See Marriott, supra note 236, at G1 (reporting on the active rivalry among
Microsoft, Nintendo, and Sony); Savitz. supra note 236, at 30 (same).

293. The costs of developing a platform standard often are substantial. 1n Sony's case,
it spent over $600 million developing the PlayStation. See Connectix, 48 F. Supp. 2d at
1214.

294. Perhaps the best example of this point is the Supreme Court‘s decision in the
Betarnax case, where it rejected the studio's argument that the recording of programming
would necessarily undermine its existing revenue streams. See Sony Corp. of Am. v.
Universal City Snrdios, 464 us. 417 (1984); see also Stephen M. Mcjohn, Fair Use of
Copyrighted Software, 28 Rutgers LJ. 593, 610 (1997) (“If a use does not adversely affect
the market for the copyrighted work, then it will not affect the ﬁnancial incentives to
produce such work.”).

295. It is plausible, though not particularly likely, that the court could have
concluded, after analyzing the relevant incentives created from the deployment of the
Virtual Game Station, that because Nintendo would sell more of its own proprietary games
for the VGS than it would have otherwise, it might make more money, even accounting for
the displacement of its console sales. Cf. Bloom, 214 F.3d at 1027 (noting that emulator
sales spur more sales for the games). In the face of such a conclusion, the use of the VGS
would constitute a “partial substitute” (as opposed to a pure complement) and would
actually act more as a complement than a substitute in terms of its actual market impact.
See Micro Star v. FormGen. lnc., 154 F.3d 1107, 1112—14 (9th Cir. 1998) (ﬁnding that
product that served as partial substitute did not constitute permissible work); Midway, 704604 COLUMBIA LAW REVIEW [V0]. 103:534
B. A Model for Horizontal Access Regulation: Lotus v. Borland
In perhaps the most famous case addressing the horizontal access
issue, the First Circuit held that Borland could incorporate Lotus 1-2-3’5
command hierarchy to build a rival spreadsheet program (its Quattro
program).296 In that case, Lotus argued that to allow competition within
the standard it developed by not protecting the user interface threatened
to make its invention—and the community of users trained on the inter-
face—a “common resource” in which no particular company would want
to invest.297 Borland countered that it could not compete without access
to Lotus’s user interface, as many users already had adopted it. Unfortu-
nately, no clear opinion emerged in this case, in which the districtjudge
and the two court of appeals judges to hear the case all took different
approaches (and the Supreme Court divided equally).298
In Lotus, Borland argued that Lotus’s established standard needed to
be shared through some form of an open access arrangement.299 In rul-
ing for Borland and providing it with open access to Lotus’s user inter-
face, the majority focused on whether the would-be protected resource
constituted “a method of operation"—like the buttons on a VCR—that
warranted no protection under copyright law.~“"0 By contrast, judge
Boudin’s concurrence called for a more ﬂexible inquiry and a competi-
tion policy focus. In particular, he recognized that the establishment of a
standard—in this case, a user interface and a particular command hierar-
F.2d at 1009 (ﬁnding that product that modulated speed of game was wholly derivative of
original work and therefore was infringing); see also Lewis Galoob Toys, Inc. v. Nintendo
of Am., 1nc._. 964 F.2d 965, 969 (9th Cir. 1992) (“The Game Genie does not physically
incorporate a portion of a copyrighted work, nor does it supplant demand for a
component of that work.“).

296. Lotus Dev. Corp. v. Borland lnt’l, lnc.. 49 F.3d 807. 819 (lst Cir. 1995). aﬂ’ d by
an equally divided Court, 516 U.S. 233 (1996). The Lotus case has provided commentators
a veritable cornucopia of opportunities for comment. For example, one possible
complicating factor in that case was that Borland's rival product constituted an "improving
use" that tnightjustify some intellectual property protection for it (as opposed to a pure
clone. see. e.g., Lotus Dev. Corp. v. Paperback Software lnt'l, 740 F. Supp. 37, 75 (D. Mass.
1990)). See Mark A. Lemley, The Economics of Improvement in Intellectual Property
Law. 75 Tex. L. Rev. 989, 1079-81 (1997) (arguing for a doctrine that allows access to
“radical improvers"); see also Pierre N. Leval, Towards a Fair Use Standard, 103 Harv. L.
Rev. 1105, 1111—12 (1990) (championing concept of “transformative use").

297. See Lotus, 49 F.3d at 819—22 (Boudin, _].. concurring) (explicating stakes for
developers and public in resolving access issues); see also joseph Farrell, Creating Local
Competition. 49 Fed. Comm. L._]. 201, 210 (1996) ("Just as we would not want to reduce
the life of a patent from seventeen years to seventeen minutes, since that would reduce
innovative effort, so also it would be unwise policy to make all developers of network
externalities share them in all circumstances"). See generally Dam, supra note 124
(explaining why standards merit. protection).

298. Lotus. 799 F. Supp. 203, rev'd, 49 F.3d 807 (lst Cir. 1995), affd by an equally
divided Court, 516 U.S. 233 (1996).

299. Lotus, 49 F .3d at 815.

300. 1d. at 816—17 (discussing principle set forth in Baker v. Selden. 101 U.S. 99
(1879)).2003] INTELLECTUAL PROPERTY POLICY 605
chy for spreadsheets—merited protection in order to encourage innova-
tion. At the same time, Judge Boudin made clear that complete protec-
tion could—rather than provide a reward necessary to encourage
innovation—limit consumer welfare?“ Thus, where a ﬁrst mover like
Lotus already had received a “substantial reward for being ﬁrst,“02 which
appears to have been the case in Lotus, intellectual property protection
should recede and allow others to appropriate some of the value of the
industry standard so as to allow for competition-‘03
As suggested byjudge Boudin‘s concurrence in Lotus, a fair use anal-
ysis easily can accommodate the type of competition policy questions
raised by the competitive platforms model.3°4 Under such an approach,
courts would have more ﬂexibility to engage in a fact-speciﬁc analysis that
evaluates the relevant market circumstances discussed in Part III as op-
posed to making a categorical judgment about the protectibility of prod-
uct and user interfaces.-°’05 Unlike the reverse engineering of a platform
standard, which involves the literal copying of software, the issue in Lotus
was Borland’s nonliteral copying of the user interface—as opposed to the
literal copying of software as part of reverse engineering. Nonetheless,
both scenarios involve functionally similar issues related to the viability of
competing platform standards and should be evaluated under the same
analytical framework.

The appropriate development of the fair use principle would look to
the competitive platforms model to guide courts in cases like Lotus. (By
301. Asjudge Boudin explained:
But if a better spreadsheet comes along, it is hard to see why customers who have
learned the Lotus menu and devised macros for it should remain captives of
Lotus because of an investment in learning made by the users and not by Lotus.

Lotus has already reaped a substantial reward for being ﬁrst; assuming that the
Borland program is now better, good reasons exist for freeing it to attract old
Lotus customers: to enable the old customers to take advantage of a new
advance, and to reward Borland in turn for making a better product.
ld. at 821 (Boudin,]., concurring).

302. ld.; see Lemley, Internet Standardization, supra note 47, at 1060 n.64; c.f. Apple
Computer, Inc. v. Microsoft Corp., 799 F. Supp. 1006, 1025 (N.D. Cal. 1993) (“By virtue of
having been the ﬁrst commercially successful programmer to put these generalized
features together, Apple had several years of market dominance in graphical user
interfaces until Microsoft introduced Windows 3.0 . . . .").

303. For a discussion of some of the ﬁrst mover advantages in the software market, see
Shapiro 8c Varian, Information Rules, supra note 152, at 29—32 (explaining business
strategies open to first movers); Mark A. Lemley 8: David W. O'Brien, Encouraging
Software Reuse, 49 Stan. L. Rev. 255, 274—75 (1997) (explaining how beneﬁts of being ﬁrst
mover motivate innovation).

304. The majority opinion relied on the traditional principle that fair use
presumptively only can be invoked by noncommercial actors. but judge Boudin
highlighted how this is “something less than a deﬁnitive answer; [as] ‘presumptively' does
not mean 'always' and, in any event, the doctrine of fair use was created by the courts and
can be adapted to new purposes." Lotus, 49 F.3d at 82] (Boudin, J., concurring).

305. For another articulation of this approach, see O’Rourke, supra note 83, at
1233—34 (discussing beneﬁts of fair use analysis).606 COLUMBIA LAW REVIEW [Vol. 103:534
contrast, proponents of the commons model would argue that user inter-
faces are outside the scope of copyright law, and proprietary control ad-
vocates would argue that user interfaces should always be protected.)
The ﬂexible approach animated by the competitive platforms model rec-
ognizes that the ideal form of competition Would come if other providers
could successfully offer an alternate—and superior—form of a user inter-
face. By contrast, if there was only one appropriate form of a user inter—
face (or it appeared that one would ultimately emerge as dominant), that
single usable interface should not be protected.306 In most cases, how-
ever, there will be a range of possible user interfaces,307 even if they rely
on certain similar characteristicsﬁo“ Unfortunately, the Lotus majority
opinion did not even begin to grapple with a number of important fac-
tors that should have been part of its analysis: the nature of access ar-
rangement (horizontal or vertical), whether the case involved access to a
user interface (as opposed to a product interfaces), whether the market
could have supported other successful interfaces, and whether the would-
be improving use was transformative (as opposed to mere cloning).

As suggested byjudge Boudin’s concurrence, the legality of reverse
engineering or copying a user interface should follow a three-part in-
quiry. First, it should consider whether the inventor, through first mover
advantages and the like, has reaped a sufﬁcient reward such that protec-
tion of the interface would be unnecessary to facilitate innovation (even if
the limits of the protection were known ex ante). 1n nearly all cases
306. See Farrell 8c Katz, supra note 43, at 649; cf. Mitel, Inc. v. lqtel, Inc., 124 F.3d
1366, 1376 (10th Cir. 1997) (ﬁnding command codes that facilitated long distance
telephone not copyrightable because, although they contained the requisite level of
originality, they were “dictated by external functionality and compatibility requirements of
the computer and telecommunications industries”).

307. Unfortunately, some courts have glided over this possibility, asserting that user
interfaces are like buttons on a VCR and that, as they are functional, there is no room for
creativity. See Lotus. 49 F.3d at 817; Apple Compuler. 799 F. Supp. at 1023, aff'd, 35 F .3d
1435 (1994), cert denied, 513 U.S. 1184 (1995). In the Apple case, however, the court did
undertake a careful examination of user interfaces in the software industry to evaluate
which features would constitute unprotectible “scenes a faire"—noncreative elements that
are common to similar products—under copyright law. 1d. at 1024. To the extent that an
element of a user interface reflects the only practical way to achieve a particular
functionality, either the scenes a faire or merger doctrines of copyright law would leave the
standard unprotectible. See supra note 306.

308. In Atari, Inc. v. N. Am. Philips Consumers Elec. Corp., for example, the Seventh
Circuit confronted this issue in the context of maze-like video games, explaining that there
were a number of ways in which the basic game could be presented. 672 F.2d 607, 617—18
(7th Cir. 1982). On matters of user interface design, where there are no reasonable
alternative options—say, as to whether to use the command “print“ or its “Ctrl P“
shortcut—the doctrine of merger “denies copyright protection to expression necessarily
incidental to the idea being expressed.” Computer Assocs. 1nt'l, Inc. v. Altai, Inc., 982 F.2d
693, 707 (2d Cir. 1992). Similarly, the scenes at faire doctrine excludes from protection]
those expressions that are "'as a practical manner indispensable, or at least standard, in
the treatment of a given topic.” Atmi, 672 F.2d at 616 (quoting Alexander v. Haley, 460 F.
Supp. 40. 45 (S.D.N.Y. 1978)).2003] INTELLECTUAL PROPERTY POLICY 607
where an information platform captures a dominant share of a market,
this consideration will weigh in favor of allowing open access.309 Second,
it should evaluate whether competitors could challenge the proprietary
standard’s position in the market without such a sharing of the user inter-
face.310 Finally, it should determine whether the company seeking to
take advantage of the sharing requirement used it to facilitate the intro-
duction of a diﬁerentiated rival product rather than merely imitate the
initial inventions“
In a case reﬂecting the ﬂip side of the Lotus decision, Atari Games
Corp. 1;. Nintendo of America312 involved a scenario where a court correctly
declined to grant access to a rival's system. In particular, the Federal
Circuit concluded that, even though fair use access would be appropriate,
Nintendo's patented “lock-out” chip provided it with protection against
Atari’s reverse engineering efforts?"3 By not affording Atari an intellec-
tual property right to play Nintendo games on its console, the court en-
couraged rivals to build up their own systems, which Sega, Sony, and
Microsoft later did successfully.314 Moreover, this decision—unlike Con-
nectix—-drew the appropriate line between determining when to grant ac-
309. An amicus brief in Lotus presented a rationale for why that was the case. See
Brief Amicus Curiae of American Committee for Interoperable Systems and Computer 8c
Committee Industrial Association in Support of Respondent at 27, Lotus Dev. Corp. v.
Borland lnt’l, Inc., 516 U.S. 1167 (1996) (No. 94-2003) (“[E]conomisls have established
that in markets with strong network extemalities, such as the market for software, the ﬁrst
comer reaps enormous competitive advantages from the establishment of a de facto
standard interface specification"). Similarly,_]udge Boudin explained that the apparently
arbitrary nature of Lotus's invention counseled against extending it copyright protection.
See Lotus, 49 F.3d at 819—21 (Boudin, j., concurring) (emphasizing that Lotus’s menu is
premised on a set of commands that “are largely for standard procedures that Lotus did
not invent and are common words that Lotus cannot monopolize").

310. This analysis should take account of the fact that competitors can gain access to
product interfaces for purposes of enabling users to transfer user-created macros to a rival
product. See supra notes 126—130 and accompanying text.

311. judge Boudin’s concurring opinion stressed this point, explaining that his
rationale “would not automatically protect Borland if it had simply copied the Lotus menu
(using different codes), contributed nothing of its own, and resold Lotus under the
Borland label.” Lotus, 49 F.3d at 821 (Boudin,j., concuning). Similarly, the particularized
protection for reverse engineering allowed in the SCPA also requires that any reverse
engineering of protected works he used to provide an improved—and not merely an
imitated—competitive product. See 17 U.S.C. § 906(a) (2000); see also Raskind 8c Stern,
supra note 67, at 266 (noting that the Act’s reverse engineering provision “strikes a balance
between the exclusive reproduction right of an owner and the public interest in
innovation, by imposing the condition on the copyist that an improved, or at least original,
chip product must result"). Signiﬁcantly, this requirement should not be the sole criteria
for allowing reverse engineering because, as demonstrated by Connectix, it is often quite
simple to make modest improvements and use those as a suﬁicient basis to free ride on a
much more substantial investment. See Sony Computer Entm't, Inc. v. Connectix Corp.,
203 F.3d 596. 601 (9th Cir. 2000), cert. denied, 531 U.S. 871 (2000).

312. 975 F.2d 832 (Fed. Cir. 1992).

313. Id. at 840; see also Shapiro 8c Varian, Standards Wars, supra note 150, at 285
(noting that Atari could not overcome Nintendo’s lock-out chip).

314. See supra notes 217, 230-233 and accompanying text.608 COLUMBIA LAW REVIEW [Vol. 103:534
cess to truly complementary products,315 as opposed to a horizontal ac-
cess claim like that at issue in Lotus.

The Internet world, like that of video games, is premised on the de-
velopment of information platforms that will, in many cases, compete
with one another. In the applications layer, as well as in some possible
logical layer developments, there is going to be an increasing number of
rival inventions that will battle it out for supremacy. The recent browser
war between Microsoft and Netscape and the current tussles between rival
media players provide some hints of what sorts of competitive struggles
lie ahead. To ensure that marketplace battles like these beneﬁt consum-
ers, it is important that intellectual property law develop a clear and effec-
tive vision for when and how proprietary rights in software will be pro-
tected. The competitive platforms model, as outlined in Part IV and
applied above, would do just that.

C. Possible Objections to a Competitive Platforms-Based Approach to Reverse
Engineering
Given the continuing debate over the proper legal treatment of re-
verse engineering, it should not be surprising that there are numerous
countervailing arguments against revising it to follow the competitive
platforms model. In particular, there are three related criticisms that can
be made against this approach: the difficulty of distinguishing between
vertical and horizontal access, the administrative costs in implementing
this model, and the challenge of discerning at what point in a standard's
development a rival firm should be permitted access. This section ad-
dresses each concern in turn.

Despite the fair use doctrine's inquiry into whether a product is sub-
stitutive or transformative, courts have resisted focusing on whether ac-
cess to a proprietary standard is sought by a horizontal competitor or a
vertical complementor. Although one response is to criticize courts for
failing to analyze the actual market effects?” another might be to evalu-
ate whether this distinction is too elusive to guide intellectual property
policy. In support of this point, one might highlight how platform own-
ers often choose a “razor and blades” strategy whereby they do not choose
to appropriate fully the value of the platform via direct sales, but instead
315. Such products would include those involving claims of vertical compatibility
where a party sought to develop games for an information platform. See, e.g., Sega Enters.
Ltd. v. Accolade. lnc., 977 F.2d 1510, 1514 (9th Cir. 1992) (granting manufacturer of
games access to game console); Lewis Galoob Toys, Inc. v. Nintendo of Am., Inc.. 780 F.
Supp. 1283, 1286 (N.D. Cal. 1991), aff’d, 964 F.2d 965 (9th Cir. 1992) (granting
manufacturer of plug-in cartridge access to game console). lndeed, in [111112; Galoob T oys,
the Ninth Circuit focused directly on the competitor-complementor distinction. See 964
F.2d at 969 (“The Game Genie is useless by itself . . . . [It does not] supplant demand for
Nintendo game cartridges [or the Nintendo console]. Such innovations rarely will
constitute infringing derivative works under the Copyright Act”).

316. See, e.g.. Rothman. supra note 289, at 7—8 (deeming the inquiry of the Connerlix
court on this point to be “superficial“).2003] INTELLECTUAL PROPERTY POLICY 609
make money off the complementary product.EH7 Thus, for cases where
an information platform owner decided to appropriate the value of the
platform in the complementary market, such control could be said to be
as important as control over the platform market itself.

There are several responses to the concern that there may not be a
meaningful distinction between horizontal and vertical access to a stan-
dard. First, as to this basic criticism, it is important to highlight that the
right to the self-help remedy of reverse engineering is a less desirable
mode of access than a license, so there still are considerable incentives
for parties to strike a deal. The costliness of reverse engineering, the
considerable value of the technical support that the inventor can provide,
and the potential trademark issues that may impede the marketing of a
product that is not ofﬁcially approved are among the factors that might
drive parties to the negotiating table.318 Moreover, it is important that
intellectual property law set as the default principle that complementors
should be afforded such access because in most cases it will be to the
advantage of the platform owners—and the public more generally—to
enable such access and opportunity for improvement.319
A related criticism regarding the vertical-horizontal distinction is that
some products could elude easy classiﬁcation. In particular, a “mid-
dleware” product that emerges as a complementary one, but ultimately
substitutes for the platform itself, might not easily fall into either cate-
gory. (The classic example of middleware is the Web browser, which
could be used in combination with Microsoft’s operating system, but also
threatened—over the long terrn—to supplant it.) In such cases, the out-
come will depend on whether the product can be used with the plat-
form—as, say, a browser is used with an operating system—or actually
would be used instead of the product, but might not provide as optimal
performance—as, say, the virtual game station product.

A second potential criticism of the competitive platforms model is
that a standards-based approach would add additional administrative
costs and uncertainty into the current legal environment. These costs
would include not only the court costs of judging whether a particular
317. Indeed, this business model is now standard in the video game industry. See
Samuelson 8c Scotchmer, supra note 39, at 1618—19 (“In the game system market, platform
developers typically lose money on sales of consoles, making up losses on sales of games
and peripherals"); Gaither, supra note 217, at C17 (“While proﬁts are thin as
manufactures subsidize the sale of hardware, they grow rapidly once consumers start
buying games to play on them.”).

318. For a discussion of the costs, see johnson-Laird, supra note 39, at 900-01. On
the trademark point, competitors are allowed to represent that a product is compatible
with an information platform, but they do not gain the beneﬁts of being approved or
certiﬁed by the platform owner. See Mark A. Lemley 8: David McGowan, Could java
Change Everything? The Competitive Propriety of a Proprietary Standard, 43 Antitrust
Bull. 715, 761—64 (1998).

319. See Katz, supra note 46, at 334—35 (outlining default rule rationale for vertical
access).610 COLUMBIA LAW REVIEW [VoL 103:534
platform standard has established suﬂicient dominance to lose intellec-
tual property protection against reverse engineering, but also the costs in
the marketplace of license agreements that would be forestalled by the
legal uncertainty of a standards-based approach. As an initial matter, this
argument mistakenly assumes that the status quo provides for a clear rule
on the legality of reverse engineering and the protectibility of platform
standards and user interfaces.320 Consequently, if the competitive plat-
forms model strikes the right balance, it may well lead to greater certainty
than a bad rule that generates undesirable outcomes and begs for excep-
tions.-"‘21 In terms of the costs on the legal system of implementing a stan-
dards-based approach, the second response is to point to how antitrust
law—both as administered by the courts and by legal counseling—suc-
cessfully uses a similar rule-of-reason-type approach,322 as does copyright
law in implementing the idea-expression dichotomy that separates pro-
tected from unprotected works.323 Not only does a standards-based ap-
proach allow for important precision in this area, but its undeﬁned na-
ture also can encourage parties to settle access disputes out of court on
mutually agreeable terms?£24 Moreover, as the analogy to antitrust law
suggests, lawyers and business persons will increasingly grow proﬁcient in
anticipating the likely outcome and will act accordingly.

The ﬁnal question presents the greatest challenge to the workability
and soundness of the approach outlined herein: How will courts know
when a standard is sufﬁciently well established to allow access through
reverse engineering? As an initial matter, it is critical to remember the
two alternatives: allowing access in all cases, or never allowing access.
Given the ﬂaws of each alternative, the risks of a limited right of access
would have to be quite great to warrant rejection in favor of either alter-
native approach. To be sure, there is not an obvious marketplace test of
320. See Rothman, supra note 289, at 1 (describing reverse engineering issue as an
“intractable problem” for intellectual property law); supra Part 11.A.1 (discussing lack of
clarity in legal treatment of reverse engineering).

321. The mles-versus—standards debate is well developed, with most commentators
acknowledging the usefulness of both and concluding that the desirability of either
approach depends on the situation. See Mindgames, Inc. v. Western Publ'g Co., Inc., 218
F.3d 652, 656—67 (7th Cir. 2000).

322. See, e.g., Michael S. jacobs, The New Sophistication in Antitrust, 79 Minn. L.
Rev. 1, 48 (1994) (explaining success of “rule-of-reason" in antitrust).

323. As Judge Learned Hand famously put it, “Obviously, no principle can be stated as
to when an imitator has gone beyond copying the ‘idea,' and has borrowed its ‘expression.’
Decisions must therefore inevitably be ad hoc." Peter Pan Fabrics, Inc. v. Martin Weiner
Corp., 274 F.2d 487, 489 (2d Cir. 1960); see also Festo Corp. v. Shoketsu Kinzoku Kogyo
Kabushiki Co., Ltd., 122 S. Ct. 1831. 1838 (2002) (stating that uncertainty created by
doctrine of equivalents in patent law is “the price of ensuring the appropriate incentives
for innovation”).

324. For an explanation of how blurry intellectual property rights can facilitate
efﬁcient bargaining, see Jason Scott Johnston. Bargaining Under Rules Versus Standards,
11 J. L. Econ. 8c Org. 256, 273 (1995). For a general discussion of when standards are
economically efﬁcient, see Louis Kaplow, Rules Versus Standards: An Economic Analysis,
42 Duke L._]. 557. 568—77. 579—84, 621—23 (1992).2003] INTELLECTUAL PROPERTY POLICY 611
whether courts can make the necessary judgments to implement a limited
access right, but the antitrust precedent is encouraging.

The analogy to antitrust is instructive here because it underscores
how an antitrust-like treatment of reverse engineering can ask courts to
undertake a similar market deﬁnition analysis in a related context. First,
it is signiﬁcant that courts evaluating antitrust cases regularly—and, for
the most part, successfully—undertake this analysis. Second, by employ-
ing such an analysis to guide the scope of intellectual property rights,
courts can enable self-help and private conduct to address market domi-
nance issues before they emerge as a monopolization issue. In the case of
RealNetworks’s use of reverse engineering to compete against Microsoft,
for example, RealNetworks is taking a proactive step that is unavailable to
an antitrust court, which generally must wait to mandate an access ar-
rangement until after a company establishes a monopolization case
against a competitor. As many commentators have highlighted with re-
spect to the browser war between Microsoft and Netscape, the possibility
of judicially overseen relief came too late to help Netscape.325 But for
cases where reverse engineering of a platform standard or copying of a
user interface can forestall or avoid monopolization, permitting this con-
duct can potentially avoid the need for antitrust action.

The goal of the limited access right envisioned by the competitive
platforms model and a reformed legal treatment of reverse engineering is
to facilitate a procompetitive environment. Under this regime, parties
would be free to gain access through reverse engineering at any point,
but if they guessed wrong about whether an information platform consti-
tuted a dominant standard, they would potentially be liable for infringe-
ment. At present, the potential for guessing incorrectly is much greater
than it would be under the competitive platforms model, as there is no
clear guide for the scope and application of the fair use and misuse prin-
ciples in such cases. To be sure, a clear rule always allowing access or
never allowing it would eliminate such guesswork, but it would potentially
undermine investment incentives or the ability to limit the market domi-
nance of a particular product.

For close cases, the remedial consequences for any infringement
would depend upon the circumstances surrounding the infringement. In
some cases, where the appropriateness of access is a close call, courts
might choose to provide for a liability-type remedy where the defendant
would be allowed continued access based upon some licensing fee.326 In
325. See Timothy F. Bresnahan, A Remedy that Falls Short of Restoring Competition,
Antitrust, Fall 2001, at 67, 71 n.10 (noting that the threat presented to Microsoft by the
Web browser no longer exists); Charles A. James, The Real Microsoft Case and Settlement,
Antitrust, Fall 2001, at 58, 61 (“[B]y most accounts, Microsoft has essentially won the
browser war; relief to revive Netscape Navigator as a middleware threat may have been too
little, too late.").

326. See Campbell v. Acuff-Rose Music, Inc., 510 U.S. 569, 578 n.10 (1994)
(suggesting that injunctive relief may not be appropriate in close cases where a defendant612 COLUMBIA LAW REVIEW [Vol. 103:534
other cases, where there is a number of alternative viable standards—as is
the case in cell phone standards327 and video game consoles—there may
well be marketplace analogs of licensing systems that could be imposed
by the courts, along with any other remedies that would be appropriate to
impose on a party who infringed a standard holder's intellectual prop-
erty. With respect to Internet applications, there is likely to be a number
of rival applications to perform a particular function because the open
logical standard invites entry. As the case of media players illustrates,
there often will be a number of entrants that will seek to develop a suc-
cessful information platforrn.32“
CONCLUSION
Intellectual property law's unresolved search for a sensible regime to
regulate computer software and the Internet reﬂects a fundamental de-
bate over what framework will best facilitate innovation in the informa—
tion industries. Given the difﬁculty of resolving the commons versus pro-
prietary control debate, the increasing complexity of and uncertainty in
this area is quite understandable. But intellectual property law’s continu-
ing failure to produce any clear framework for determining when infor-
mation platform inventors can maintain proprietary control of their in-
ventions undermines its ability to advance a coherent competition policy
strategy.

Courts and policymakers, rather than adopting either the commons
or proprietary control perspective, should embrace the approach sug-
gested by the competitive platforms model. This model envisions that
intellectual property policy can regulate open access to information plat-
forms in advance of and in a manner consistent with antitrust law. In
particular, intellectual property law, in regulating the permissibility of re-
verse engineering, possesses the tools to facilitate access to platform stan-
dards and user interfaces only where so doing will thwart the likely domi-
nance of a single ﬁrm—before antitrust or regulatory oversight would
need to step in to facilitate entry.

exceeds the bounds of its fair use rights). The classic framework for evaluating the
appropriate choice of remedies is, of course, the one set forth in Guido Calabresi 8c A.
Douglas Melamed. Property Rules, Liability Rules, and Inalienability: One View of the
Cathedral, 85 Harv. L. Rev. 1089, 1106—10 (1972). In general, Congress leaves it to the
courts to develop the appropriate remedy for intellectual property violation, but, on
occasion. it has imposed a particular regime. See, e.g., 7 U.S.C. § 136a(c)(l)(F) (2000)
(setting forth binding arbitration procedures for competing pesticide registration claims).

327. To be sure, the FCC (and not a court) decided whether to mandate compatibility
to a common protocol in the cell phone context. See supra note 212 and accompanying
text. But such questions could easily be presented to courts and presumably will be with
increasing frequency. Cf. Secure Servs. Tech., Inc. v. Time and Space Processing, Inc., 722
F. Supp. 1354. 1359—63 (ED. Va. 1989) (examining intellectual property issues raised by
reverse engineering of a protocol for enhanced facsimile machines to establish horizontal
compatibility).

328. See supra notes 56—58 and accompanying text.2003] INTELLECTUAL PROPERTY POLICY 613
The competitive platforms model also recognizes how intellectual
property policy in general and Internet policy in particular calls for the
federal government and standard-setting bodies to play an important role
in supporting and coordinating the development of the common infor-
mation technology standards that would not be developed by any proprie-
tary ﬁrm. With respect to the Internet, the open standards that comprise
its logical layer, for example, require government funding and the coor-
dination of standard setting bodies to evolve in an effective fashion. Put
simply, even with intellectual property protection, these standards are ap-
propriately treated as a commons because they are not likely to be devel-
oped or maintained by a proprietary ﬁrm. But if the Intemet’s entire
software infrastructure, including rival applications, is treated as a com-
mons, individual ﬁrms will not invest in developing and extending its po-
tential. Thus, an optimal Internet policy requires that both courts—in
developing judicial doctrine—and policymakers—in supporting the com-
mon and open Internet infrastructure—reject the attractive simplicity of
the commons and proprietary control perspectives and embrace the bal-
ance and nuance of the competitive platforms model.Copyright© 2003 EBSCO Publishing


![[80_Learning_Education/81_High_School/81.00_Sophomore_Year/81.01_US_History/Research Project/Source Documents/The Internet, Innovation, and Intellectual Property Policy.pdf]]