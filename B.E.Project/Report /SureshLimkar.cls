%-------Minimal Class file Contents--------------------------------
%\NeedsTeXFormat{LaTeX2e}
%\ProvidesClass{minimal}[1995/10/30 Standard LaTeX minimal class]
%\renewcommand{\normalsize}{\fontsize{10pt}{12pt}\selectfont}
%\setlength{\textwidth}{6.5in}
%\setlength{\textheight}{8in}
%------------------------------------------------------------------

%My Style File
\NeedsTeXFormat{LaTeX2e}[1995/12/01]
\ProvidesClass{SVNITStyle}[2010/04/10] %YYYY/MM/DD

\LoadClass{report} 

\usepackage{graphicx}
\usepackage{fancybox}
\usepackage{ifthen}
\usepackage{changepage}
\usepackage{color}
\usepackage{setspace}
\usepackage{fancyhdr}
\definecolor{cust-blue}{rgb}{0.1,0.4,1.0}


% taken from page http://www.artofproblemsolving.com/LaTeX/AoPS_L_GuideLay.php
\setlength{\topmargin}{0in}
\setlength{\headheight}{0in}
\setlength{\headsep}{0in}
\setlength{\textheight}{8.5in}
\setlength{\textwidth}{6.5in}
\setlength{\oddsidemargin}{0in}
\setlength{\evensidemargin}{0in}
\setlength{\headheight}{0pt}
\setlength{\headsep}{0.25in}


%Default Definitions
%-----------------------------------------------------------------------------
\def \statustitle {Mr.}
\def \thesistype {Dissertation Preliminary Report}
\def \thesistitle {Video Shot Detection}
\def \authorname {Milind Padalkar}
\def \nameoncerti {Padalkar Milind Gajanan}
\def \RegNo {P08CO961}
\def \course {M.Tech.}
\def \guidename {Dr. M. A. Zaveri}
\def \depthead {Dr. D. C. Jinwala}
\def \logofile {SVNITlogo}
\def \department {Computer Engineering}
\def \insti {Sardar Vallabhbhai National Institute of Technology}
\def \place {Surat - 395007 (Gujarat), India}
\def \year {2009-10}
%-----------------------------------------------------------------------------

%\setlength{\hoffset}{-1.0in}
%\setlength{\voffset}{-1.0in}


%Title Page Definition
%-----------------------------------------------------------------------------
\newcommand{\maketitlepage}{
\input{./titlepage}
}
%-----------------------------------------------------------------------------

%Certificate Page Definition
%-----------------------------------------------------------------------------
\newcommand{\makecertipage}{
\input{./certificate}
}
%-----------------------------------------------------------------------------

%Acknowledgment Page Definition
%-----------------------------------------------------------------------------
\newcommand{\makeackpage}{
\input{./acknopage}
}
%-----------------------------------------------------------------------------

%Abstract Page Definition
%-----------------------------------------------------------------------------
\newcommand{\makeabstrpage}{
\input{./abstractpage}
}
%-----------------------------------------------------------------------------