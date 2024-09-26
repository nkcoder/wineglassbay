#!/usr/bin/env bash

for script in *.scala; do
  echo "Running $script"
  scala-cli run "$script"
done
