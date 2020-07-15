![CI](https://github.com/dinhanhx/simple-ci-for-java/workflows/CI/badge.svg)

# Simple ci for java

Note: ci = continuous integration 

In order to make every exercise more connected (4-1, 4-2, 4-3, 4-5) of the book Introduction to Software Testing by Paul.A and Jeff.O,

I decided to creat this repos to not mess up or creat any conflict with [Dr Truong Anh Hoang's repos](https://github.com/truonganhhoang/Software-Testing-2020-USTH) and [My homework repos](https://github.com/dinhanhx/Software-Testing-2020-USTH).

This also enable me to be more flexible on creating project in IntelliJ IDEs

# Student info

Full name: Vu Dinh Anh

Student ID: BI9-037

Email: anhvd.bi9037@st.usth.edu.vn

# Tips:

- All Test Results files (in log folder) are html files, hence please use [this tool](https://htmlpreview.github.io/) to view those without cloning this repos.

# Answers in detail:

## Ex 4-1

- Can be seen how it's done by looking at log folder or looking at from [this commit](https://github.com/dinhanhx/simple-ci-for-java/commit/b6eccf80a1c01ced6f233744d08e5c1799ac8a43) to [that commit](https://github.com/dinhanhx/simple-ci-for-java/commit/4721238ae1e774e512f6d792f82d639b87cd0883).

## Ex 4-2 (The setup CI workflow)

GitHub Repos page -> Actions --scroll down --> Continuous integration workflows --choose--> [Simple Workflow](https://github.com/actions/starter-workflows/blob/930a2cac2bfea6c9d44813a374348d81b7b410fd/ci/blank.yml)

[my simple-ci.yml](https://github.com/dinhanhx/simple-ci-for-java/blob/master/.github/workflows/simple_ci.yml)

## Ex4-3

I can't find a command line tool (that is compatible with JUnit) to show code coverage of Java codes for Ubuntu-based Distros

## Ex4-2 and Ex4-5

- Experiment: add `DataDrivenCalc_Wrong.java`

- Result: it's failed, the badges turns red

- Fix the fault: remove `DataDrivenCalc_Wrong.java`