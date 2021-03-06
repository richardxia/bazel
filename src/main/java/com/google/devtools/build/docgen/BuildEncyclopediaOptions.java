// Copyright 2014 The Bazel Authors. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.google.devtools.build.docgen;

import com.google.devtools.common.options.Option;
import com.google.devtools.common.options.OptionsBase;

import java.util.List;

/**
 * Command line options for the Build Encyclopedia docgen.
 */
public class BuildEncyclopediaOptions extends OptionsBase {
  @Option(
    name = "input_dir",
    abbrev = 'i',
    defaultValue = "",
    allowMultiple = true,
    help = "An input directory to read source files"
  )
  public List<String> inputDirs;

  @Option(
    name = "provider",
    abbrev = 'p',
    defaultValue = "",
    help = "The name of the rule class provider"
  )
  public String provider;

  @Option(
    name = "output_dir",
    abbrev = 'o',
    defaultValue = ".",
    help = "An output directory."
  )
  public String outputDir;

  @Option(
    name = "blacklist",
    abbrev = 'b',
    defaultValue = "",
    help = "A path to a file listing rules not to document."
  )
  public String blacklist;

  @Option(
    name = "help",
    abbrev = 'h',
    defaultValue = "false",
    help = "Prints the help string."
  )
  public boolean help;
}
