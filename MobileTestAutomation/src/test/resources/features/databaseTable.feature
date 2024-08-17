# |   Sütun Adı    | Veri Tipi |             Kısıtlamalar               |                                         Açıklama                                               |
# ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
# | user_id        |  int      | Primary Key, Auto Increment            | Her kullanıcı için benzersiz kimlik                                                            |
# | email          | varchar   | Unique, Not Null                       | Kullanıcının e-posta adresi (zorunlu)                                                          |
# | password       | varchar   | Nullable                               | Kullanıcının şifresi (sosyal medya girişi için boş olabilir)                                   |
# | phone          | varchar   | Unique                                 | Kullanıcının telefon numarası                                                                  |
# | birth_date     | date      | Not Null                               | Kullanıcının doğum tarihi                                                                      |
# | sign_up_method | varchar   | Not Null                               | Kayıt olma yöntemi (email, Facebook, Google vb.)                                               |
# | social_id      | varchar   | Nullable                               | Sosyal medya platformu tarafından sağlanan benzersiz kimlik (e-post girişi için boş olabilir.) |
# | created_at     | datetime  | Not Null, Deafult -> Current_Timestamp | Kullanıcının oluşturulma zamanı                                                                |
# | updated_at     | datetime  |                                        | Son güncelleme tarihi                                                                          |
# | status         | varchar   | Default -> "active"                    | Hesap durumu (aktif, pasif vb.)                                                                |


Feature: Database Columns Verification

  Scenario: TC_03.01 "user_id" auto-increment and uniqueness
    Given New user is inserted into the table.
    When Another user is inserted into the table .
    Then Verify that the "user_id" of the second user is greater than the "user_id" of the first user.
    And Verify that "user_id" is unique for all users.

  Scenario: TC_03.02 "email" uniqueness
    Given New user with "email" "test@gmail.com" is inserted into the table.
    When Another user with "email" "test@gmail.com" is inserted into the table.
    Then Verify that an error occurs indicating that the value "email" must be unique.

  Scenario: TC_03.03 "email" NOT NULL constraint
    Given Nser with "email" as NULL is inserted into the table.
    Then Verify that an error occurs indicating that the value "email" cannot be NULL.

  Scenario: TC_03.04 "password" NULL constraint
    Given New user with "password" as NULL is inserted into the table.
    Then Verify that the insertion was successful.

  Scenario: TC_03.05 "password" with valid value
    Given New user with "password" as "Test123." is inserted into the table.
    Then Verify that the insertion was successful.

  Scenario Outline: TC_03.06 "password" minimum length and complexity requirements
    Given New user with password as "<value>" is inserted into the table.
    Then Verify that an error appears with the text "<message>".
    Examples:
      | value    | message                                                   |
      | Test     | The password does not meet the minimum length requirement |
      | 12345678 | The password does not meet the complexity requirements    |

  Scenario: TC_03.07 "password" hashing
    Given New user with "password" as "Test123." is inserted into the table.
    Then Verfiy that the "password" field is stored in the database as encrypted value.

  Scenario: TC_03.08 "phone" uniqueness
    Given New user with "phone" "5432109876" is inserted into the table.
    When Another user with "phone" "5432109876" is inserted into the table.
    Then Verify that an error occurs indicating that the value "phone" must be unique.

  Scenario: TC_03.09 "birth_date" with valid dates
    Given New user with "birth_date" "08-13-2002" is inserted into the table.
    Then Verify that the insertion was successful.

  Scenario: TC_03.10 "birth_date" with invalid dates
    Given New user with "birth_date" "22-13-2002" is inserted into the table.
    Then Verify that an error appears indicating that the date is invalid.

  Scenario: TC_03.11 "birth_date" NOT NULL constraint
    Given New user with "birth_date" as NULL is inserted into the table.
    Then  Verify that an error occurs indicating that the value "birth_dat" cannot be NULL.

  Scenario Outline: TC_03.12 "sign_up_method" with valid methods
    Given New user with sign_up_method "<methodName>" is inserted into the table.
    Then Verify that the insert was successful.
    Examples:
      | methodName |
      | email      |
      | facebook   |
      | x          |
      | google     |

  Scenario: TC_03.13 "sign_up_method" with invalid method
    Given New user with "sign_up_method" "invalid method" is inserted into the table.
    Then Verify that an error appears indicating that "sign_up_method" must be a valid method.

  Scenario: TC_03.14 "social_id" nullability and uniqueness
    Given New user with "social_id" as NULL is inserted into the table.
    Then Verify that the insert was successful.
    When Another user with "social_id" "unique_social_id" is inserted into the table.
    Then Verify that the insert was successful.
    When Another user with "social_id" "unique_social_id" is inserted into the table.
    Then Verify that an error occurs indicating that the value "social_id" must be unique.

  Scenario: TC_03.15 "created_at" default value and immutability
    Given New user is inserted into the table.
    Then Verify that "created_at" is set to the current timestamp.
    When The user is updated
    Then Verify that the value of "created_at" has not changed.

  Scenario: TC_03.16 "updated_at" auto-update behavior
    Given New user is inserted into the table.
    When The user is updated.
    Then Verify that "updated_at" is set to the current timestamp.

  Scenario: TC_03.17 "status" default value
    Given New user is inserted into the table without specifying "status".
    Then Verify that "status" is set to "active".
    When User with "status" "passive" is inserted into the table.
    Then Verify that "status" is set to "passive".

  Scenario: TC_03.18 foreign key constraints
    Given New user with a foreign key referencing another table is inserted into the table.
    When the referenced record does not exist
    Then Verify that an error appears indicating a foreign key restriction violation.
    When The referenced record exists
    Then Verify that the insert was successful.
