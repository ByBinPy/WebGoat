/*
 * SPDX-FileCopyrightText: Copyright © 2017 WebGoat authors
 * SPDX-License-Identifier: GPL-2.0-or-later
 */
package org.owasp.webgoat.lessons.challenges;

import java.security.SecureRandom;
import java.util.Base64;

public interface SolutionConstants {

  // Generate a random password at server startup instead of hardcoding
  String PASSWORD = generateRandomPassword();

  private static String generateRandomPassword() {
    byte[] randomBytes = new byte[24];
    new SecureRandom().nextBytes(randomBytes);
    return Base64.getUrlEncoder().withoutPadding().encodeToString(randomBytes);
  }
}
